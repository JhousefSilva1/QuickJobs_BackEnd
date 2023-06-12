package bo.edu.ucb.quickjobs.quickjobs.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import bo.edu.ucb.quickjobs.quickjobs.security.model.RefreshToken;
import bo.edu.ucb.quickjobs.quickjobs.security.model.User;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);

    @Modifying
    int deleteByUser(User user);
}