package ra.doantotnghiep2025nhc.model.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TopSpendingCustomerDTO {
    private Long userId;
    private String fullName;
    private String email;
    private BigDecimal totalSpent;
}
