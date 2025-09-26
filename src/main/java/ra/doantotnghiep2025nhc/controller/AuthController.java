package ra.doantotnghiep2025nhc.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import ra.doantotnghiep2025nhc.advice.DataError;
import ra.doantotnghiep2025nhc.exception.CustomerException;
import ra.doantotnghiep2025nhc.model.dto.*;
import ra.doantotnghiep2025nhc.service.AuthService;
import ra.doantotnghiep2025nhc.service.TokenService;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private static final Logger log = Logger.getLogger(AuthController.class.getName());

    @Autowired
    private AuthService authService;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/sign-up")
    public ResponseEntity<?> register(@Valid @RequestBody UserRegisterRequestDTO requestDTO, BindingResult bindingResult) throws CustomerException {
        log.info("Yêu cầu đăng ký với username: " + requestDTO.getUsername());
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError error : bindingResult.getFieldErrors()) {
                errors.put(error.getField(), error.getDefaultMessage());
            }
            log.warning("Lỗi validate khi đăng ký: " + errors);
            return ResponseEntity.badRequest().body(new DataError<>(400, errors));
        }
        UserRegisterResponseDTO responseDTO = authService.register(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }

    @PostMapping("/sign-in")
    public ResponseEntity<?> login(@Valid @RequestBody UserLoginRequestDto requestDTO, BindingResult bindingResult) throws CustomerException {
        log.info("Yêu cầu đăng nhập với username: " + requestDTO.getUsername());
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError error : bindingResult.getFieldErrors()) {
                errors.put(error.getField(), error.getDefaultMessage());
            }
            log.warning("Lỗi validate khi đăng nhập: " + errors);
            return ResponseEntity.badRequest().body(new DataError<>(400, errors));
        }
        UserLoginResponse responseDTO = authService.login(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping("/logout")
    public ResponseEntity<?> logout(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        if (token == null || !token.startsWith("Bearer ")) {
            return ResponseEntity.badRequest().body(new DataError<>(400, "Token không hợp lệ hoặc không tồn tại"));
        }
        token = token.substring(7);
        tokenService.invalidateToken(token);
        return ResponseEntity.ok(new DataError<>(200, "Đăng xuất thành công"));
    }
}