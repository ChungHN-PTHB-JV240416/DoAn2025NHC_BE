package ra.doantotnghiep2025nhc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.doantotnghiep2025nhc.model.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
    boolean existsByCommentId(Long commentId);
}