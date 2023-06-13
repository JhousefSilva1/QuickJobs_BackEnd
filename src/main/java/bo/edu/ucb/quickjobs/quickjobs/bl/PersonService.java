package bo.edu.ucb.quickjobs.quickjobs.bl;

import bo.edu.ucb.quickjobs.quickjobs.dao.PersonRepository;
import bo.edu.ucb.quickjobs.quickjobs.dto.PersonDTO;
import bo.edu.ucb.quickjobs.quickjobs.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createPerson(PersonDTO personDTO) {
        Person person = new Person();
        // Set the person properties from the DTO
        person.setNames(personDTO.getNames());
        person.setSurnames(personDTO.getSurnames());
        person.setDni(personDTO.getDni());
        person.setBorn(personDTO.getBorn());
        person.setGender(personDTO.getGender());
        person.setCellPhone(personDTO.getCellPhone());
        person.setEmail(personDTO.getEmail());
        person.setPassword(personDTO.getPassword());
        person.setImgProfile(personDTO.getImgProfile());
        person.setStatus(true);
        person.setVersion(1);

        // Save the person entity in the repository
        return personRepository.save(person);
    }
}
