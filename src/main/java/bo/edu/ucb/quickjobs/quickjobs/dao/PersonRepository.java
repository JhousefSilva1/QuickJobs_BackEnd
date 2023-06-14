package bo.edu.ucb.quickjobs.quickjobs.dao;

import bo.edu.ucb.quickjobs.quickjobs.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PersonRepository extends JpaRepository<Person, Long> {



    Person findByIdPerson(Long idPerson);

    String findByPasswordOrderByEmail(String email);


    Person findByEmail(String email);
    void createPerson(Person person);

}
