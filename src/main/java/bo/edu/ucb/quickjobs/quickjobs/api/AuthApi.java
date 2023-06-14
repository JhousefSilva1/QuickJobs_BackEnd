package bo.edu.ucb.quickjobs.quickjobs.api;

import bo.edu.ucb.quickjobs.quickjobs.bl.PersonBl;
import bo.edu.ucb.quickjobs.quickjobs.bl.SecurityBl;
import bo.edu.ucb.quickjobs.quickjobs.dto.AuthReqDTO;
import bo.edu.ucb.quickjobs.quickjobs.dto.AuthResDTO;
import bo.edu.ucb.quickjobs.quickjobs.dto.PersonDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/persons")
@CrossOrigin(origins = "*")
public class AuthApi {
    private SecurityBl securityBl;

    public AuthApi (SecurityBl securityBl){
        this.securityBl=securityBl;
    }

    @GetMapping("/{personId}")
    public PersonDTO test(@PathVariable(name = "personId")Long  personId){
        return this.securityBl.getPersonByPk(personId);
    }

    @PostMapping()
    public AuthResDTO authentication(@RequestBody AuthReqDTO authReqDto) {
        return securityBl.authenticate(authReqDto);
    }


}
