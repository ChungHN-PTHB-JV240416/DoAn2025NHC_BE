package ra.doantotnghiep2025nhc.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WishListResponseDTO {
    private Long wishListId;
    private Long productId;
    private String productName;
    private String productImage;
    private Double price;
}
