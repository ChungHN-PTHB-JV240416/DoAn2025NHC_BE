package ra.doantotnghiep2025nhc.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ra.doantotnghiep2025nhc.model.dto.CommentDTO;
import ra.doantotnghiep2025nhc.model.dto.ReplyDTO;
import ra.doantotnghiep2025nhc.service.imp.CommentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/comments")
public class AdminCommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public ResponseEntity<List<CommentDTO>> getAllComments() {
        List<CommentDTO> comments = commentService.getAllComments();
        return ResponseEntity.ok(comments);
    }

    @PostMapping("/{commentId}/reply")
    public ResponseEntity<ReplyDTO> replyToComment(@Valid @PathVariable Long commentId, @RequestBody ReplyDTO replyDTO, BindingResult bindingResult) {
        ReplyDTO reply = commentService.replyToComment(commentId, replyDTO);
        return ResponseEntity.ok(reply);
    }
}