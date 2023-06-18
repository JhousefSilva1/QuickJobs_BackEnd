package bo.edu.ucb.quickjobs.quickjobs.Persistence.dao;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<PersonEntity, Long> {


    PersonEntity findByEmail(String email);
}
