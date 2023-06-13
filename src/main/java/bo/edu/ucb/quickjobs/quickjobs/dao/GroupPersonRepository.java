package bo.edu.ucb.quickjobs.quickjobs.dao;

import bo.edu.ucb.quickjobs.quickjobs.entity.GroupPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupPersonRepository extends JpaRepository<GroupPerson, Long> {
}
