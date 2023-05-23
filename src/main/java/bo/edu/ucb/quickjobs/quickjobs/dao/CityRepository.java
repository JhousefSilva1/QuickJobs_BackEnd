package bo.edu.ucb.quickjobs.quickjobs.dao;



import bo.edu.ucb.quickjobs.quickjobs.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    // Puedes agregar métodos personalizados para consultas específicas si lo necesitas
}
