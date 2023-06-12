package bo.edu.ucb.quickjobs.quickjobs.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bo.edu.ucb.quickjobs.quickjobs.security.model.ERole;
import bo.edu.ucb.quickjobs.quickjobs.security.model.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}