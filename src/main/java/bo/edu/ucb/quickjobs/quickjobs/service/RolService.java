package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dao.RolRepository;
import bo.edu.ucb.quickjobs.quickjobs.entity.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {

    private final RolRepository rolRepository;

    @Autowired
    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    // Ejemplo de método para guardar un rol
    public Rol guardarRol(Rol rol) {
        return rolRepository.save(rol);
    }

    // Ejemplo de método para buscar un rol por su ID
    public Rol obtenerRolPorId(Integer id) {
        return rolRepository.findById(Long.valueOf(id)).orElse(null);
    }

    // Otros métodos de servicio para manipular los roles
}