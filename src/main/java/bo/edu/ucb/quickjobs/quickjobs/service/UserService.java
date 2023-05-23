package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dao.UserRepository;
import bo.edu.ucb.quickjobs.quickjobs.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserService {

//    @Autowired
//    private UserRepository userRepository;
//
//    public List<User> getAll(){
//        return userRepository.getAll();
//    }
//
//    public Optional<User> getByUser(String id){
//        return userRepository.getByUser(id);
//    }
//
//    public User save (User user){
//        return userRepository.save(user);
//    }
//
//    public boolean delete (String id){
//        return getByUser(id).map(user -> {
//            userRepository.delete(user);
//            return true;
//        }).orElse(false);
//    }

}
