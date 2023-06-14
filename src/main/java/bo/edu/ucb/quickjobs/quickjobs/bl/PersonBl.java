package bo.edu.ucb.quickjobs.quickjobs.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.quickjobs.quickjobs.dao.PersonRepository;
import bo.edu.ucb.quickjobs.quickjobs.dto.PersonDTO;
import bo.edu.ucb.quickjobs.quickjobs.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonBl {

    private PersonRepository personRepository;

    @Autowired
    public PersonBl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

//    public void createPerson(PersonDTO personDTO){
//
//        Person person = new Person();
//        // Set the person properties from the DTO
//        person.setNames(personDTO.getNames());
//        person.setSurnames(personDTO.getSurnames());
//        person.setDni(personDTO.getDni());
//        person.setBorn(personDTO.getBorn());
//        person.setGender(personDTO.getGender());
//        person.setCellPhone(personDTO.getCellPhone());
//        person.setEmail(personDTO.getEmail());
//        //person.setPassword(personDTO.getPassword());
//        person.setImgProfile(personDTO.getImgProfile());
//        person.setStatus(true);
//        person.setVersion(1);
//        String password = BCrypt.withDefaults().hashToString(12,
//                personDTO.getPassword().toCharArray());
//        personDTO.getPassword();
//        person.setPassword(password);
//
//
//        // Save the person entity in the repository
////        personRepository.save(person);
//        this.personRepository.save(person);
//    }

    public Person findByEmail(String email){
        return personRepository.findByEmail(email);
    }


}
