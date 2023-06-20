package bo.edu.ucb.quickjobs.quickjobs.Controller;

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

    //1.Obtener un servicio por su id
    @GetMapping("/{serviceId}")
    public ResponseEntity<ServiceeEntity> get(@PathVariable Long serviceId){
        return ResponseEntity.ok(this.serviceeService.get(serviceId));
    }

    //2. Obtener todos los servicios
    @GetMapping
    public ResponseEntity<List<ServiceeEntity>> getAll(){
        return ResponseEntity.ok(this.serviceeService.getAll());
    }
    //3. Agregar un servicio
    @PostMapping
    public ResponseEntity<ServiceeEntity> add(@RequestBody ServiceeEntity servicee){
        if (servicee.getIdService()== null || !this.serviceeService.exists(servicee.getIdService())){
            return ResponseEntity.ok(this.serviceeService.save(servicee));
        }
        else {
            return ResponseEntity.badRequest().build();
        }
    }

    //4. Actualizar un servicio
    @PutMapping
    public ResponseEntity<ServiceeEntity> update(@RequestBody ServiceeEntity servicee){
        if (servicee.getIdService()== null || !this.serviceeService.exists(servicee.getIdService())){
            return ResponseEntity.ok(this.serviceeService.save(servicee));
        }
        else {
            return ResponseEntity.badRequest().build();
        }
    }
    //5. Eliminar un servicio
    @DeleteMapping("/{serviceId}")
    public ResponseEntity<Void> delete(@PathVariable Long serviceId){
        if (this.serviceeService.exists(serviceId)){
            this.serviceeService.delete(serviceId);
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.badRequest().build();
        }
    }
    // 6.Obtener los servicios activos
    @GetMapping("/available")
    public ResponseEntity<List<ServiceeEntity>> getActive(){
        return ResponseEntity.ok(this.serviceeService.getAvailable());
    }
    // 7.Obtener los servicios inactivos
    @GetMapping("/unavailable")
    public ResponseEntity<List<ServiceeEntity>> getInactive(){
        return ResponseEntity.ok(this.serviceeService.getUnavailable());
    }
}
