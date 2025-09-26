package ra.doantotnghiep2025nhc.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ra.doantotnghiep2025nhc.model.entity.Category;
import ra.doantotnghiep2025nhc.model.entity.OrderDetail;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    List<OrderDetail> findTop10ByOrder_CreatedAtBetweenOrderByOrderQuantityDesc(LocalDateTime from, LocalDateTime to, Pageable pageable);

    List<OrderDetail> findByProductCategory(Category category);

}
