package bo.edu.ucb.quickjobs.quickjobs.api;

import bo.edu.ucb.quickjobs.quickjobs.bl.SecurityBl;
import bo.edu.ucb.quickjobs.quickjobs.dto.AuthReqDto;
import bo.edu.ucb.quickjobs.quickjobs.dto.AuthResDto;
import bo.edu.ucb.quickjobs.quickjobs.dto.PersonDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthApi {

    private SecurityBl securityBl;

    public AuthApi (SecurityBl securityBl){
        this.securityBl=securityBl;
    }

    @GetMapping("/{userId}")
    public PersonDto test(@PathVariable(name = "PersonId") Long PersonId){

        return this.securityBl.getUserByPk(PersonId);
    }

    @PostMapping()
    public AuthResDto authentication(@RequestBody AuthReqDto authReqDto) {
        return securityBl.authenticate(authReqDto);
    }
}
