package ra.doantotnghiep2025nhc.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserUpdateRequestDTO {
    private String fullname;
    private String phone;
    private String avatar;
    private String address;
}
