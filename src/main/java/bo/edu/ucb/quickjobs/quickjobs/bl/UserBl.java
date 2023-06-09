package bo.edu.ucb.quickjobs.quickjobs.bl;

import bo.edu.ucb.quickjobs.quickjobs.domain.dao.UserRepository;
import bo.edu.ucb.quickjobs.quickjobs.domain.dto.UserDto;
import bo.edu.ucb.quickjobs.quickjobs.persistence.entity.User;

public class UserBl {
    private UserRepository userRepository;

    public UserBl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto saveUser(UserDto userDto) {
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setStatus(userDto.getStatus());
        user.setVersion(userDto.getVersion());
        user.setUser(userDto.getUser());
        user.setHost(userDto.getHost());
        user.setDate(userDto.getDate());
        user = userRepository.save(user);
        userDto.setUserId(user.getUserId());
        return userDto;
    }
}
