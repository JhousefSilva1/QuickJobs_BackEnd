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

    // con este codigo se puede obtener todas las personas activas
    @GetMapping("/available")
    public ResponseEntity<List<PersonEntity>> getAvailable(){
        return ResponseEntity.ok(this.personService.getAvailable());
    }

    @GetMapping("/unavailable")
    public ResponseEntity<List<PersonEntity>> getUnavailable(){
        return ResponseEntity.ok(this.personService.getUnavailable());
    }

    @PostMapping
    public ResponseEntity<PersonEntity> add(@RequestBody PersonEntity person){//el @RequestBody es para que el objeto que se le pasa por el body se guarde en la variable personEntity
           //valida si el id de la persona es nulo o si existe en la base de datos, si existe retorna un badRequest
            // si no existe retorna un ok, y se guarda la persona
        if(person.getIdPerson()== null || !this.personService.exists(person.getIdPerson())){
               return ResponseEntity.ok(this.personService.save(person));
           }
        //return ResponseEntity.ok(this.personService.save(person));
        else {
               return ResponseEntity.badRequest().build();
           }
    }

    @PutMapping
    public ResponseEntity<PersonEntity> update(@RequestBody PersonEntity person){//el @RequestBody es para que el objeto que se le pasa por el body se actualice en la variable personEntity

        if(person.getIdPerson()!= null || this.personService.exists(person.getIdPerson())){
            return ResponseEntity.ok(this.personService.save(person));
        }
        //return ResponseEntity.ok(this.personService.save(person));
        else {
            return ResponseEntity.badRequest().build();
        }


    }
    @DeleteMapping("/{PersonId}")
    public ResponseEntity<Void> delete(@PathVariable Long PersonId){
        if(this.personService.exists(PersonId)){
            this.personService.delete(PersonId);
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.badRequest().build();
        }
    }

}
