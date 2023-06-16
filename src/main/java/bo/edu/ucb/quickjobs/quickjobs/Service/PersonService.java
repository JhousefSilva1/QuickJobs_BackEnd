package bo.edu.ucb.quickjobs.quickjobs.Service;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.dao.PersonRepository;
import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    //metodo para obtener todas las personas
    public List<PersonEntity> getAll(){
       // return personRepository.findAll();
        return this.personRepository.findAll();
    }
    //metodo para obtener una persona por su id
    public PersonEntity get(Long PersonId){
        return this.personRepository.findById(PersonId).orElseThrow(()-> new RuntimeException("La persona no esta registrada en la base de datos"));
    }
    //metodo para agregar una persona
    public PersonEntity save(PersonEntity person){
        return this.personRepository.save(person);
    }

    public boolean exists(Long PersonId){
        return this.personRepository.existsById(PersonId);
    }


}
