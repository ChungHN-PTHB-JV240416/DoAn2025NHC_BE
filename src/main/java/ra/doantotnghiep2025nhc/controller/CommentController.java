package ra.doantotnghiep2025nhc.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ra.doantotnghiep2025nhc.model.dto.CommentDTO;
import ra.doantotnghiep2025nhc.service.imp.CommentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public ResponseEntity<CommentDTO> createComment(@Valid  @RequestBody CommentDTO commentDTO) {
        CommentDTO createdComment = commentService.createComment(commentDTO);
        return ResponseEntity.ok(createdComment);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<CommentDTO>> getCommentsByProductId(@Valid @PathVariable Long productId) {
        List<CommentDTO> comments = commentService.getCommentsByProductId(productId);
        return ResponseEntity.ok(comments);
    }
}