package bo.edu.ucb.quickjobs.quickjobs.Persistence.dao;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.GroupEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface GroupRepository extends ListCrudRepository<GroupEntity, Long> {
}
