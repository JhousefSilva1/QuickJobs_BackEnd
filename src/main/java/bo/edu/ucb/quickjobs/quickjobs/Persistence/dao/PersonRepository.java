package bo.edu.ucb.quickjobs.quickjobs.Persistence.dao;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.PersonEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PersonRepository extends ListCrudRepository<PersonEntity, Long> {

    List<PersonEntity>findAllByStatusTrue();

    List<PersonEntity>findAllByStatusFalse();
}
