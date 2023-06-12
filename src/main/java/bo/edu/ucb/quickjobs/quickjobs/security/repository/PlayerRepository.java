package bo.edu.ucb.quickjobs.quickjobs.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bo.edu.ucb.quickjobs.quickjobs.security.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}