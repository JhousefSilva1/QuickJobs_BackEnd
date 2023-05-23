package bo.edu.ucb.quickjobs.quickjobs.api;
import bo.edu.ucb.quickjobs.quickjobs.bl.SecurityBl;
import bo.edu.ucb.quickjobs.quickjobs.dto.AuthReqDto;
import bo.edu.ucb.quickjobs.quickjobs.dto.AuthResDto;
import bo.edu.ucb.quickjobs.quickjobs.dto.UserDto;
import org.springframework.web.bind.annotation.*;


@RestController
//@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/auth/login")
public class AuthApi {

  private SecurityBl securityBl;


  public AuthApi(SecurityBl securityBl){
    this.securityBl = securityBl;
  }

  @GetMapping("/{userId}")
  public UserDto test(@PathVariable(name = "userId") Long userId){
    return this.securityBl.getUserByPk(Long.valueOf(userId));
  }

  @PostMapping("")
  public AuthResDto authentication(@RequestBody AuthReqDto authReqDto) {
        return securityBl.authenticate(authReqDto);
    }



}
