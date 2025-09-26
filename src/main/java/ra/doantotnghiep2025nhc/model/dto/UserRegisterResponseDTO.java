package ra.doantotnghiep2025nhc.model.dto;

import lombok.*;
import ra.doantotnghiep2025nhc.model.entity.Role;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserRegisterResponseDTO {
    private String username;
    private Set<Role> roles;
}
