package bo.edu.ucb.quickjobs.quickjobs.Persistence.dao;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.ServiceeEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface ServiceeRepository extends ListCrudRepository<ServiceeEntity, Long> {
}
