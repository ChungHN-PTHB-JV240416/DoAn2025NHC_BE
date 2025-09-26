package ra.doantotnghiep2025nhc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.doantotnghiep2025nhc.model.entity.PasswordResetToken;

import java.util.Optional;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    Optional<PasswordResetToken> findByToken(String token);
}