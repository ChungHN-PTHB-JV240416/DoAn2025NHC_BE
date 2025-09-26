package ra.doantotnghiep2025nhc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.doantotnghiep2025nhc.model.entity.TokenBlackList;

public interface TokenRepository extends JpaRepository<TokenBlackList,Long> {
    Boolean existsByToken(String token);
}