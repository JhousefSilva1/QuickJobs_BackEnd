package bo.edu.ucb.quickjobs.quickjobs.repository;

import bo.edu.ucb.quickjobs.quickjobs.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
