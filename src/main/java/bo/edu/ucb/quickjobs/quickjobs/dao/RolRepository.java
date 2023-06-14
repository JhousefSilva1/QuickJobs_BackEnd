package bo.edu.ucb.quickjobs.quickjobs.dao;

import bo.edu.ucb.quickjobs.quickjobs.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Long> {
    Rol findByNameRol(String rolName);
}
