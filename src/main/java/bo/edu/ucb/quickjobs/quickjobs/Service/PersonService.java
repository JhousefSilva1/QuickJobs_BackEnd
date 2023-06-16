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

    public List<PersonEntity> getAll(){
       // return personRepository.findAll();
        return this.personRepository.findAll();
    }


}
