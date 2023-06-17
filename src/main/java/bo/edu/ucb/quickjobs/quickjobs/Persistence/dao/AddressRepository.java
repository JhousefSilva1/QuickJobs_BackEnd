package bo.edu.ucb.quickjobs.quickjobs.Persistence.dao;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.AddressEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface AddressRepository extends ListCrudRepository<AddressEntity, Long> {
}
