package bo.edu.ucb.quickjobs.quickjobs.repository;

import bo.edu.ucb.quickjobs.quickjobs.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {

    public List<Address> findByPersonId(long publicationId);
}
