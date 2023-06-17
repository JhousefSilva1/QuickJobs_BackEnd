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

    public List<ServiceeEntity> getAll(){
        return this.serviceeRepository.findAll();
    }

    public ServiceeEntity save(ServiceeEntity servicee){
        return this.serviceeRepository.save(servicee);
    }

    public boolean exists(Long serviceId){
        return this.serviceeRepository.existsById(serviceId);
    }
}
