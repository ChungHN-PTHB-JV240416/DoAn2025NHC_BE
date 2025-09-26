package ra.doantotnghiep2025nhc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.doantotnghiep2025nhc.model.entity.Address;
import ra.doantotnghiep2025nhc.model.entity.User;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByUserId(Long userId);
    List<Address> findByUser(User user);

}
