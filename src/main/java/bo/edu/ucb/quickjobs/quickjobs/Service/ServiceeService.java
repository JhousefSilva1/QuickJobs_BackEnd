package bo.edu.ucb.quickjobs.quickjobs.Service;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.dao.ServiceeRepository;
import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.ServiceeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceeService {

    private final ServiceeRepository serviceeRepository;

    @Autowired
    public ServiceeService(ServiceeRepository serviceeRepository) {
        this.serviceeRepository = serviceeRepository;
    }

    //1. Obtener un servicio por su id
    public ServiceeEntity get(Long serviceId){
        return this.serviceeRepository.findById(serviceId).orElseThrow();
    }
    //2. Obtener todos los servicios
    public List<ServiceeEntity> getAll(){
        return this.serviceeRepository.findAll();
    }
    //3. Agregar un servicio
    public ServiceeEntity save(ServiceeEntity servicee){
        return this.serviceeRepository.save(servicee);
    }
    //4. Verificar si existe un servicio
    public boolean exists(Long serviceId){
        return this.serviceeRepository.existsById(serviceId);
    }
    //5. Eliminar un servicio
    public void delete(Long serviceId){
        this.serviceeRepository.deleteById(serviceId);
    }
    //6. Obtener Servicios Activos
    public List<ServiceeEntity> getAvailable(){
        return this.serviceeRepository.findAllByStatusTrue();
    }

    //7. Obtener Servicios Inactivos
    public List<ServiceeEntity> getUnavailable(){
        return this.serviceeRepository.findAllByStatusFalse();
    }

}
