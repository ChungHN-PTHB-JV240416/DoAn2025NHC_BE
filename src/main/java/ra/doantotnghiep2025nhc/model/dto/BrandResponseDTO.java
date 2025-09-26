package ra.doantotnghiep2025nhc.model.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BrandResponseDTO {
    private Long brandId;
    private String brandName;
    private String description;
    private String image;
    private Boolean status;
    private Long categoryId;
    private Date createdAt;
    private Date updatedAt;
}