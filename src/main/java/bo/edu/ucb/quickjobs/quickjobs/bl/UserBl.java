package bo.edu.ucb.quickjobs.quickjobs.bl;

import bo.edu.ucb.quickjobs.quickjobs.dao.PersonRepository;
import bo.edu.ucb.quickjobs.quickjobs.dao.UserRepository;
import bo.edu.ucb.quickjobs.quickjobs.entity.Person;
import bo.edu.ucb.quickjobs.quickjobs.entity.User;

public class UserBl {

    private UserRepository userRepository;

    private PersonRepository personRepository;

    public UserBl(UserRepository userRepository, PersonRepository personRepository) {
        this.userRepository = userRepository;
        this.personRepository = personRepository;
    }

    public void Person(Person person) {
        User user = new User();

    }

    public Person findPersonById(Long id) {
        return (Person) personRepository.findById(id).get();
    }
}