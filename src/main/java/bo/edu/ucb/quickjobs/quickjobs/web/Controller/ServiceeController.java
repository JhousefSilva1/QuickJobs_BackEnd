package bo.edu.ucb.quickjobs.quickjobs.web.Controller;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.ServiceeEntity;
import bo.edu.ucb.quickjobs.quickjobs.Service.ServiceeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/services")
public class ServiceeController {

    private final ServiceeService serviceeService;

    @Autowired
    public ServiceeController(ServiceeService serviceeService) {
        this.serviceeService = serviceeService;
    }

    @GetMapping
    public ResponseEntity<List<ServiceeEntity>> getAll(){
        return ResponseEntity.ok(this.serviceeService.getAll());
    }
    @PostMapping
    public ResponseEntity<ServiceeEntity> add(@RequestBody ServiceeEntity servicee){
        if (servicee.getIdService()== null || !this.serviceeService.exists(servicee.getIdService())){
            return ResponseEntity.ok(this.serviceeService.save(servicee));
        }
        else {
            return ResponseEntity.badRequest().build();
        }
    }
}
