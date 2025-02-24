package Fashion_Store.Fashion_Store.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import Fashion_Store.Fashion_Store.Model.Roles;
import Fashion_Store.Fashion_Store.Model.Users;
import Fashion_Store.Fashion_Store.Repository.UserRepository;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = this.userRepository.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User không tồn tại"));

        return new org.springframework.security.core.userdetails.User(
                user.getUserName(),
                user.getPassword(),
                roleToAuthority(user.getRole()));
    }
    // mình để 1 user chỉ có 1 role, nếu có nhiều role thì sẽ phải sửa lại

    // Lấy danh sách role của user, tránh lỗi nếu roles == null
    private Collection<? extends GrantedAuthority> roleToAuthority(Roles role) {
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
    }

}
