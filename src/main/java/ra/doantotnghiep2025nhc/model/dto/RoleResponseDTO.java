package ra.doantotnghiep2025nhc.model.dto;

import lombok.*;
import ra.doantotnghiep2025nhc.model.entity.RoleType;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RoleResponseDTO {
    private Long id;
    private RoleType roleType;
}
