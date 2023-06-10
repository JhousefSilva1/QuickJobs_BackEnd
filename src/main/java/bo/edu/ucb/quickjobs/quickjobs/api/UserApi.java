package bo.edu.ucb.quickjobs.quickjobs.api;

import bo.edu.ucb.quickjobs.quickjobs.bl.SecurityBl;
import bo.edu.ucb.quickjobs.quickjobs.bl.UserBl;
import bo.edu.ucb.quickjobs.quickjobs.dto.CreatePersonDto;
import bo.edu.ucb.quickjobs.quickjobs.dto.ResponseDto;
import bo.edu.ucb.quickjobs.quickjobs.entity.Person;
import bo.edu.ucb.quickjobs.quickjobs.util.AuthUtil;
import bo.edu.ucb.quickjobs.quickjobs.util.QuickJobsException;
import org.springframework.web.bind.annotation.*;

import java.util.Map;



@RestController
@RequestMapping("/api/v1/user")
public class UserApi {
    private UserBl userBl;
    private SecurityBl securityBl;

    public UserApi(UserBl userBl, SecurityBl securityBl) {
        this.userBl = userBl;
        this.securityBl = securityBl;
    }


    @PostMapping
    public Map createUser(@RequestHeader Map<String,String> headers, @RequestBody CreatePersonDto createUserDto){
        System.out.println("Headers:"+ headers);
        if (headers.get("authorization")==null && headers.get("Authorization")==null ){
            return Map.of("message", "No se ha enviado el token de authorization");
        }
        String jwt = "";
        if (headers.get("Authorization") != null){
            jwt = headers.get("Authorization").split("")[1];
        }
        else {
            jwt = headers.get("authorization").split("")[1];
        }
        System.out.println("El token es:"+ jwt);
        userBl.createPerson(createUserDto);
        return  Map.of("message","User created");
    }

    /*

    @PostMapping
    public Map createUser(@RequestBody CreateUserDto createUserDto){
        userBl.createUser(createUserDto);
        return  Map.of("message","User created");
    }
     */

    /*
    @PostMapping
    public ResponseDto<String> createUser(@RequestHeader Map<String,String> headers, @RequestBody CreateUserDto createUserDto){
        try {
            String jwt = AuthUtil.getTokenFromHeader(headers);
            //Si no hay error, entonces:
            AuthUtil.verifyHasRole(jwt, "create user");
            userBl.createUser(createUserDto);
            return new ResponseDto<>("Usuario creado correctamente",null,true);
        }
        catch (UberKException ex){
            return new ResponseDto<>(ex.getMessage(), null, false);
        }
    }

    /**
     * Endpoint para probar la busqueda por llave primaria
     * @param headers
     * @return
     */

    @GetMapping("/")
    public ResponseDto<Person> getUserFromToken(@RequestHeader Map<String, String> headers) {
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
            // Do nothing
        }
        try {
            String username = AuthUtil.isUserAuthenticated(AuthUtil.getTokenFromHeader(headers));
            return new ResponseDto<>(this.userBl.findByUsername(username), null, true);
        }
        catch (QuickJobsException ex) {
            return new ResponseDto<>(null, ex.getMessage(), false);
        }
    }
}
