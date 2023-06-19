package bo.edu.ucb.quickjobs.quickjobs.configuration;//package bo.edu.ucb.quickjobs.quickjobs.configuration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//
//@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableGlobalAuthentication
//public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.cors().and().csrf().disable();
//
//        return httpSecurity.build();
//    }
//}

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .cors().and()
                .authorizeHttpRequests()
                .requestMatchers(HttpMethod.GET, "/api/**").hasAnyRole("Customer")
//                .requestMatchers(HttpMethod.PUT, "/api/**").permitAll()
                .requestMatchers(HttpMethod.POST, "/api/**").hasAnyRole("Employee")
                .anyRequest()
//                .permitAll();
                .authenticated()
                .and()
                .httpBasic();
        return http.build();
    }
//    @Bean
//    public UserDetailsService memoryUsers() {
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password(passwordEncoder().encode("admin"))
//                .roles("ADMIN")
//                .build();
//
//        UserDetails customer = User.builder()
//                .username("customer")
//                .password(passwordEncoder().encode("customer"))
//                .roles("CUSTOMER")
//                .build();
//
//
//        return new InMemoryUserDetailsManager(admin,customer);
//    }
    @Bean
    public PasswordEncoder passwordEncoder() {

//            @Override
//            public String encode(CharSequence charSequence) {
//                return charSequence.toString();
//            }
//            @Override
//            public boolean matches(CharSequence charSequence, String s) {
//                return charSequence.toString().equals(s);
//            }
        return new BCryptPasswordEncoder();
    }
}