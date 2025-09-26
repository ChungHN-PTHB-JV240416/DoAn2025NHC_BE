package ra.doantotnghiep2025nhc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ra.doantotnghiep2025nhc.model.entity.User;
import ra.doantotnghiep2025nhc.repository.UserRepository;

import java.util.stream.Collectors;

@Service
public class UserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(username);
        UserPrinciple userPrinciple = new UserPrinciple();
        userPrinciple.setUser(user);
        userPrinciple.setAuthorities(
                user.getRoles().stream().map(
                                role -> new SimpleGrantedAuthority(role.getRoleName().name()))
                        .collect(Collectors.toSet())
        );
        return userPrinciple;
    }
}
