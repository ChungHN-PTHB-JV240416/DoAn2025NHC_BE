package ra.doantotnghiep2025nhc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.doantotnghiep2025nhc.model.entity.Role;
import ra.doantotnghiep2025nhc.model.entity.RoleType;

public interface RoleRepository extends JpaRepository<Role,Long> {

    //Tìm vai trò của người dùng trong cơ sở dữ liệu
    Role findRoleByRoleName(RoleType roleName);
}