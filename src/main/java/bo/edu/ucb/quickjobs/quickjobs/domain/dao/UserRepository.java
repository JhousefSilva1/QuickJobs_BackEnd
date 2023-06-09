package bo.edu.ucb.quickjobs.quickjobs.domain.dao;

import bo.edu.ucb.quickjobs.quickjobs.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    public List<User> findByUserId(User userId);

}
