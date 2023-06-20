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
    // 1. Obtener una persona todas las personas
    public List<PersonEntity> getAll(){
       // return personRepository.findAll();
        return this.personRepository.findAll();
    }
    // 2. Obtener personas con estdao activo
    public List<PersonEntity> getAvailable(){
        return this.personRepository.findAllByStatusTrue();
    }

    //3. Obtener personas con estado inactivo
    public List<PersonEntity> getUnavailable(){
        return this.personRepository.findAllByStatusFalse();
    }

    //4. Obtener una persona por su id
    public PersonEntity get(Long PersonId){
        return this.personRepository.findById(PersonId).orElseThrow(()-> new RuntimeException("La persona no esta registrada en la base de datos"));
    }



    //5. Agregar una persona
    public PersonEntity save(PersonEntity person){
        return this.personRepository.save(person);
    }
    //6. Verificar si existe una persona
    public boolean exists(Long PersonId){
        return this.personRepository.existsById(PersonId);
    }
    //7. Eliminar una persona
    public void delete(Long PersonId){
        this.personRepository.deleteById(PersonId);
    }


}
