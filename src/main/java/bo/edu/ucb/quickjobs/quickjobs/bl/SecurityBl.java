package bo.edu.ucb.quickjobs.quickjobs.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.quickjobs.quickjobs.dao.GroupDao;
import bo.edu.ucb.quickjobs.quickjobs.dao.PersonDao;
import bo.edu.ucb.quickjobs.quickjobs.dto.AuthReqDto;
import bo.edu.ucb.quickjobs.quickjobs.dto.AuthResDto;
import bo.edu.ucb.quickjobs.quickjobs.dto.PersonDto;
import bo.edu.ucb.quickjobs.quickjobs.entity.Person;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class SecurityBl {


    public final static String JWT_SECRET = "jobs";

    private PersonDao personDao;

    private GroupDao groupDao;

    public SecurityBl() {
    }

    public SecurityBl(PersonDao personDao, GroupDao groupDao) {
        this.personDao = personDao;
        this.groupDao = groupDao;
    }

    public PersonDto getUserByPk(Long personId) {
        Person person = personDao.findByPersonId(personId);

        return new PersonDto(Math.toIntExact(person.getIdPerson()), person.getUsername());
    }

    public AuthResDto authenticate(AuthReqDto credentials) {
        AuthResDto result = new AuthResDto();
        System.out.println("Comenzando proceso de autenticacion con:"+credentials);
        String currentPasswordInBCrypt = personDao.findByPaswordByUsername(credentials.username());
        System.out.println("Se obtuvo la siguiente contraseña de bbdd: " + currentPasswordInBCrypt);
        //currentPasswordInBCrypt.equals(credentials.password())
        if (currentPasswordInBCrypt != null){
            System.out.println("Se procede a comparar contrasenas");
            BCrypt.Result bcryptresult = BCrypt.verifyer().verify(credentials.password().toCharArray(),currentPasswordInBCrypt);
            //consulto si los passwords coenciden
            if (bcryptresult.verified){
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
            }else{
                System.out.println("Las contrasenas no coenciden");
                throw new RuntimeException("Forbiden the password");
            }
        }else {
            System.out.println("El usuario no existe");
            throw new RuntimeException("Forbiden the password");
        }
        return  result;
    }
    /**Este metodo genera tokens JWT*/
    private AuthResDto generateTokenJwt(String subject, int expirationTimeInSeconds){
        AuthResDto result = new AuthResDto();
        //generamos el token principal
        try{
            Algorithm algorithm = Algorithm.HMAC256(JWT_SECRET);
            String token = JWT.create()
                    .withIssuer("ucb")
                    .withSubject(subject)
                    .withClaim("refresh", false)
                    .withExpiresAt(new Date(System.currentTimeMillis()+(expirationTimeInSeconds *  1000)))
                    .sign(algorithm);
            result.setToken(token);
            String refreshToken = JWT.create()
                    .withIssuer("ucb")
                    .withSubject(subject)
                    .withClaim("refresh", true)
                    .withExpiresAt(new Date(System.currentTimeMillis()+(expirationTimeInSeconds *  1000 * 2)))
                    .sign(algorithm);
            result.setToken(token);
            result.setRefresh(refreshToken);
        }catch (JWTCreationException exception){
            throw new RuntimeException("Error al generar token",exception);
        }
        return result;
    }

    /**
     * Este metodo valida el token y retorna un user
     * @param
     *
     */

    public Person validateJwtToken(String jwt) {
        System.out.printf("VAlidando token: " + jwt);
        Person result = null;
        try {
            String username = JWT.require(Algorithm.HMAC256(JWT_SECRET))
                    .build()
                    .verify(jwt)
                    .getSubject();
            result = personDao.findByUsername(username);
        } catch (Exception exception){
            throw new RuntimeException("El usuario y cotraseña son incorrectos.", exception);
        }
        return result;
    }

}
