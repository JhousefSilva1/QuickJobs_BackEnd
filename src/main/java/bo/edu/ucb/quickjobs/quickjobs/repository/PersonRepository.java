package bo.edu.ucb.quickjobs.quickjobs.repository;

import bo.edu.ucb.quickjobs.quickjobs.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByUsername(String username);
}
