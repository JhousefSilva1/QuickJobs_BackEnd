package bo.edu.ucb.quickjobs.quickjobs.repository;

import bo.edu.ucb.quickjobs.quickjobs.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
