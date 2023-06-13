package bo.edu.ucb.quickjobs.quickjobs.controller;

import bo.edu.ucb.quickjobs.quickjobs.bl.PersonService;
import bo.edu.ucb.quickjobs.quickjobs.dto.PersonDTO;
import bo.edu.ucb.quickjobs.quickjobs.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody PersonDTO personDTO) {
        Person createdPerson = personService.createPerson(personDTO);
        return new ResponseEntity<>(createdPerson, HttpStatus.CREATED);
    }
}
