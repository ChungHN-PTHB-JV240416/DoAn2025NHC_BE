package ra.doantotnghiep2025nhc.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangePasswordRequestDTO {
    private String oldPass;
    private String newPass;
    private String confirmNewPass;
}
