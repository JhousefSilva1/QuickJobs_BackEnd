package bo.edu.ucb.quickjobs.quickjobs.Service;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.dao.UserRepository;
import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserSecurityService implements UserDetailsService {
    private final UserRepository userRepository;

    @Autowired
    public UserSecurityService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        PersonEntity personEntity = userRepository.findByEmail(email);
        if (personEntity == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return User.builder()
                .username(personEntity.getEmail())
                .password(personEntity.getPassword())
                .roles("CUSTOMER")
                .build();
    }




}

