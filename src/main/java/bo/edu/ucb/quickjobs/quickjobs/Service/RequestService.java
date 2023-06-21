package bo.edu.ucb.quickjobs.quickjobs.Service;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.dao.RequestRepository;
import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.RequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {

    private final RequestRepository requestRepository;
    @Autowired
    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public List<RequestEntity> getAll(){
        return this.requestRepository.findAll();
    }

    public RequestEntity save(RequestEntity request){
        return this.requestRepository.save(request);
    }

    public boolean exists(Long requestId){
        return this.requestRepository.existsById(requestId);
    }

    // Eliminar una solicitud
    public void delete(Long requestId){
        this.requestRepository.deleteById(requestId);
    }

    //Actualizar una solicitud
    public RequestEntity update(RequestEntity request){
        return this.requestRepository.save(request);
    }
}
