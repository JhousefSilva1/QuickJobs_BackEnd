package bo.edu.ucb.quickjobs.quickjobs.repository;

import bo.edu.ucb.quickjobs.quickjobs.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long>{
}
