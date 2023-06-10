package bo.edu.ucb.quickjobs.quickjobs.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.quickjobs.quickjobs.dao.PersonDao;
import bo.edu.ucb.quickjobs.quickjobs.dto.CreatePersonDto;
import bo.edu.ucb.quickjobs.quickjobs.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBl {

    private final PersonDao personDao;

    @Autowired
    public UserBl(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void createPerson(CreatePersonDto createPersonDto){
        Person person = new Person();
        person.setUsername(createPersonDto.getUsername());
        person.setNames(createPersonDto.getNames());
        person.setSurnames(createPersonDto.getSurnames());
        String password = BCrypt.withDefaults().hashToString(12,
                createPersonDto.getPassword().toCharArray());
      //  createPersonDto.getPassword();
        person.setPassword(password);
        person.setEmail(createPersonDto.getEmail());
        person.setCellPhone(createPersonDto.getCellphone());

        this.personDao.createPerson(person);
    }

    public Person findByUsername(String username) {
        return personDao.findByUsername(username);
    }

}
