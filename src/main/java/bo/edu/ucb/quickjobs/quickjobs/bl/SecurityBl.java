package bo.edu.ucb.quickjobs.quickjobs.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.quickjobs.quickjobs.dao.RolRepository;
import bo.edu.ucb.quickjobs.quickjobs.dao.UserRepository;

import bo.edu.ucb.quickjobs.quickjobs.dto.AuthReqDto;
import bo.edu.ucb.quickjobs.quickjobs.dto.AuthResDto;
import bo.edu.ucb.quickjobs.quickjobs.dto.UserDto;
import bo.edu.ucb.quickjobs.quickjobs.entity.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class SecurityBl {

    public final static String JWT_SECRET = "quickjobs2021";

    private UserRepository userRepository;

    private RolRepository rolRepository;

    public SecurityBl() {
    }

    public SecurityBl(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.rolRepository = rolRepository;
    }

    public UserDto getUserByPk(Long userId) {

        User user = (User) userRepository.findByName(String.valueOf(userId));
        UserDto userDto = new UserDto(Math.toIntExact((user.getIdUser())), user.getUser());

        return userDto;
    }

    /**
     * Este metodo realiza la autenticacion del sistema, va a buscar
     * el repositorio de BD la contrasena del usuario y la compara con su
     * equivalente en BRCYPT
     *
     * @param credentials
     * @return
     */


    public AuthResDto authenticate(AuthReqDto credentials) {
        AuthResDto result = new AuthResDto();
        System.out.println("Comenzando proceso de autenticacion con:" + credentials);
        String currentPasswordInBCrypt = userRepository.findByPaswordByUsername(credentials.username()).toString();
        System.out.println("Se obtuvo la siguiente contraseña de bbdd: " + currentPasswordInBCrypt);
        //currentPasswordInBCrypt.equals(credentials.password())
        if (currentPasswordInBCrypt != null) {
            System.out.println("Se procede a comparar contrasenas");
            BCrypt.Result bcryptresult = BCrypt.verifyer().verify(credentials.password().toCharArray(), currentPasswordInBCrypt);
            //consulto si los passwords coenciden
            if (bcryptresult.verified) {
                //proceso a generar el token
                System.out.println("Las contrasenas generan token");
                //result.setToken("TEST TOKEN");
                //result.setRefresh("TEST REFRESH TOKEN");
                //Consultamos los roles del usuario
                //List<UkRole> roles = roleDao.findRolesByUsername(credentials.username());
                //List<String> rolesAsString = new ArrayList<>();
                //for ( UkRole role : roles) {
                //    rolesAsString.add(role.getName());
                //}
                //System.out.println("roles"+result);
                //result = generateTokenJwt(credentials.username(), 30000, rolesAsString);
                result = generateTokenJwt(credentials.username(), 30000);
            } else {
                System.out.println("Las contrasenas no coenciden");
                throw new RuntimeException("Forbiden the password");
            }
        } else {
            System.out.println("El usuario no existe");
            throw new RuntimeException("Forbiden the password");
        }
        return result;
    }

    private AuthResDto generateTokenJwt(String subject, int expirationTimeInSeconds) {
        AuthResDto result = new AuthResDto();
        //generamos el token principal
        try {
            Algorithm algorithm = Algorithm.HMAC256(JWT_SECRET);
            String token = JWT.create()
                    .withIssuer("ucb")
                    .withSubject(subject)
                    .withClaim("refresh", false)
                    .withExpiresAt(new Date(System.currentTimeMillis() + (expirationTimeInSeconds * 1000)))
                    .sign(algorithm);
            result.setToken(token);
            String refreshToken = JWT.create()
                    .withIssuer("ucb")
                    .withSubject(subject)
                    .withClaim("refresh", true)
                    .withExpiresAt(new Date(System.currentTimeMillis() + (expirationTimeInSeconds * 1000 * 2)))
                    .sign(algorithm);
            result.setToken(token);
            result.setRefresh(refreshToken);
        } catch (JWTCreationException exception) {
            throw new RuntimeException("Error al generar token", exception);
        }
        return result;
    }

    /**
     * Este metodo valida el token y retorna un user
     *
     * @param
     */


//    public User validateToken(String token) {
//        User user = null;
//        if (token != null) {
//            try {
//                Algorithm algorithm = Algorithm.HMAC256(JWT_SECRET);
//                JWT.require(algorithm).build().verify(token);
//                String username = JWT.decode(token).getSubject();
//                user = userRepository.findByUsername(username);
//            } catch (Exception e) {
//                throw new RuntimeException("Invalid token");
//            }
//        }
//        return user;
//    }
}

