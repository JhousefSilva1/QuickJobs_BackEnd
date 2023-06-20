package bo.edu.ucb.quickjobs.quickjobs.Persistence.dao;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.AddressEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface AddressRepository extends ListCrudRepository<AddressEntity, Long> {

    String findAllByPersonId(Long personId);


    List<AddressEntity> findAllByStatusTrue();

    List<AddressEntity>findAllByStatusFalse();


}
