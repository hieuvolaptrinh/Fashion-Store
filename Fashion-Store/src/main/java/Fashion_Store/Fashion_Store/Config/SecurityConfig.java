package Fashion_Store.Fashion_Store.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import Fashion_Store.Fashion_Store.Service.UserService;

@Configuration
public class SecurityConfig {
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider(UserService userService) {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userService);
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        return daoAuthenticationProvider;
    }

    // @Bean
    // public JdbcUserDetailsManager jdbcUserDetailsManager(DataSource dataSource) {
    // JdbcUserDetailsManager userDetailsManager = new
    // JdbcUserDetailsManager(dataSource);
    // // Truy vấn lấy username, password, enabled
    // userDetailsManager.setUsersByUsernameQuery(
    // "SELECT userName, password, true FROM users WHERE userName = ?");
    // // Truy vấn lấy role của user
    // userDetailsManager.setAuthoritiesByUsernameQuery(
    // "SELECT u.userName, r.roleName FROM users u " +
    // "JOIN roles r ON u.roleId = r.roldeId " +
    // "WHERE u.userName = ?");
    // return userDetailsManager;
    // }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth

                .requestMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().permitAll())
                .formLogin(form -> form
                        .loginPage("/showLoginPage")
                        .loginProcessingUrl("/authenticateTheUser")
                        .defaultSuccessUrl("/home", true)
                        .permitAll())
                .logout(logout -> logout.permitAll())
                .exceptionHandling(exception -> exception
                        .accessDeniedPage("/showPage403"));
        return http.build();
    }

}
