package bo.edu.ucb.quickjobs.quickjobs.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bo.edu.ucb.quickjobs.quickjobs.security.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}