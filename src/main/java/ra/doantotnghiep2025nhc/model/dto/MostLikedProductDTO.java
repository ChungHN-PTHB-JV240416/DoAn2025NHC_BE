package ra.doantotnghiep2025nhc.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MostLikedProductDTO {
    private Long productId;
    private String productName;
    private int totalLikes;
}
