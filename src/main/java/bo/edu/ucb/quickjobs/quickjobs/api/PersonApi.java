package bo.edu.ucb.quickjobs.quickjobs.api;

import bo.edu.ucb.quickjobs.quickjobs.bl.PersonBl;
import bo.edu.ucb.quickjobs.quickjobs.bl.SecurityBl;
import bo.edu.ucb.quickjobs.quickjobs.dto.PersonDTO;
import bo.edu.ucb.quickjobs.quickjobs.dto.ResponseDTO;
import bo.edu.ucb.quickjobs.quickjobs.entity.Person;
import bo.edu.ucb.quickjobs.quickjobs.util.AuthUtil;
import bo.edu.ucb.quickjobs.quickjobs.util.QuickJobsException;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonApi {

    private PersonBl personBl;
    private SecurityBl securityBl;

    public PersonApi(PersonBl personBl, SecurityBl securityBl) {
        this.personBl = personBl;
        this.securityBl = securityBl;
    }

//    @PostMapping
//    public Map createPerson(@RequestHeader Map<String,String> headers, @RequestBody PersonDTO personDTO){
//        System.out.println("Headers:"+ headers);
//        if (headers.get("authorization")==null && headers.get("Authorization")==null ){
//            return Map.of("message", "No se ha enviado el token de authorization");
//        }
//        String jwt = "";
//        if (headers.get("Authorization") != null){
//            jwt = headers.get("Authorization").split("")[1];
//        }
//        else {
//            jwt = headers.get("authorization").split("")[1];
//        }
//        System.out.println("El token es:"+ jwt);
//        personBl.createPerson(personDTO);
//        return  Map.of("message","User created");
//    }
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
    public ResponseDTO<Person> getPersonFromToken(@RequestHeader Map<String, String> headers) {
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
            // Do nothing
        }
        try {
            String email= AuthUtil.isPersonAuthenticated(AuthUtil.getTokenFromHeader(headers));
            return new ResponseDTO<>(this.personBl.findByEmail(email), null, true);
        }
        catch (QuickJobsException ex) {
            return new ResponseDTO<>(null, ex.getMessage(), false);
        }
    }
}
