package bo.edu.ucb.quickjobs.quickjobs.Controller;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.ServiceeEntity;
import bo.edu.ucb.quickjobs.quickjobs.Service.ServiceeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
