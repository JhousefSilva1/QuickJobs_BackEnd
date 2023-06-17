package bo.edu.ucb.quickjobs.quickjobs.Controller;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.RequestEntity;
import bo.edu.ucb.quickjobs.quickjobs.Service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/requests")
public class RequestController {

    private final RequestService requestService;

    @Autowired
    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }
    @GetMapping
    public ResponseEntity<List<RequestEntity>> getAll(){
        return ResponseEntity.ok(this.requestService.getAll());
    }

    @PostMapping
    public ResponseEntity<RequestEntity> add(@RequestBody RequestEntity request){

        if(request.getIdRequest()== null || !this.requestService.exists(request.getIdRequest())){
            return ResponseEntity.ok(this.requestService.save(request));
        }
        else {
            return ResponseEntity.badRequest().build();
        }
       // return ResponseEntity.ok(this.requestService.save(request));
    }

}
