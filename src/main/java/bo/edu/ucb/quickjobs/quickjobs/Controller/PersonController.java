package bo.edu.ucb.quickjobs.quickjobs.Controller;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.PersonEntity;
import bo.edu.ucb.quickjobs.quickjobs.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {

    private final PersonService personService;


    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    //  con este codigo se puede obtener todas las personas
    @GetMapping
    public ResponseEntity<List<PersonEntity>> getAll(){
       return ResponseEntity.ok(this.personService.getAll());
    }

    // con este codigo se puede obtener una persona por su id
    @GetMapping("/{PersonId}")
    public ResponseEntity<PersonEntity> get(@PathVariable Long PersonId){//el @PathVariable es para que el id que se le pasa por la url se guarde en la variable PersonId
        return ResponseEntity.ok(this.personService.get(PersonId));
    }

    @PostMapping
    public ResponseEntity<PersonEntity> add(@RequestBody PersonEntity person){//el @RequestBody es para que el objeto que se le pasa por el body se guarde en la variable personEntity
        return ResponseEntity.ok(this.personService.save(person));
    }

}
