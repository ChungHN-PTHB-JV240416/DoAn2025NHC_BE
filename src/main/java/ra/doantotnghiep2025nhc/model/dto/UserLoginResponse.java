package ra.doantotnghiep2025nhc.model.dto;

import lombok.*;
import ra.doantotnghiep2025nhc.model.entity.Role;

import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserLoginResponse {
        private Long userId;
        private String username;
        private String typeToken;
        private String accessToken;
        private Set<Role> roles;
}