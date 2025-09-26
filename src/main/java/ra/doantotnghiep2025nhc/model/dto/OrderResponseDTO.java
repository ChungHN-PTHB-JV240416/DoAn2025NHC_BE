package ra.doantotnghiep2025nhc.model.dto;

import lombok.*;
import ra.doantotnghiep2025nhc.model.entity.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrderResponseDTO {
    private Long orderId;
    private String serialNumber;
    private Long userId;
    private BigDecimal totalPrice;
    private OrderStatus status;
    private String note;
    private String receiveName;
    private String receiveAddress;
    private String receivePhone;
    private LocalDateTime createdAt;
    private LocalDateTime receivedAt;
}
