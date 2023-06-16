package bo.edu.ucb.quickjobs.quickjobs.Persistence.dao;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.PersonEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PersonRepository extends ListCrudRepository<PersonEntity, Long> {


}
