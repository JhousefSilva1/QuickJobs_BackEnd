package bo.edu.ucb.quickjobs.quickjobs.dao;

import bo.edu.ucb.quickjobs.quickjobs.entity.Rol;
import bo.edu.ucb.quickjobs.quickjobs.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {

}
