package bo.edu.ucb.quickjobs.quickjobs.Persistence.dao;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.RequestEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface RequestRepository extends ListCrudRepository<RequestEntity, Long> {
}
