package bo.edu.ucb.quickjobs.quickjobs.Controller;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.dao.UserRepository;
import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.PersonEntity;
import bo.edu.ucb.quickjobs.quickjobs.Service.dto.LoginDto;
import bo.edu.ucb.quickjobs.quickjobs.configuration.JwtUtil;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    private final AuthenticationManager authenticationManager;

    private final UserRepository userRepository;


    private final JwtUtil jwtUtil;
    @Autowired
    public AuthController(AuthenticationManager authenticationManager, UserRepository userRepository, JwtUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginDto loginDto){
        UsernamePasswordAuthenticationToken login = new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword());
        Authentication authentication = this.authenticationManager.authenticate(login);

        System.out.println(authentication.isAuthenticated());
        System.out.println(authentication.getPrincipal());


        PersonEntity personEntity = userRepository.findByEmail(loginDto.getEmail());
        System.out.println(personEntity.getAccountType());


     //   String jwt = this.jwtUtil.create(loginDto.getEmail(), loginDto.getAccountType());

        String jwt = this.jwtUtil.create(loginDto.getEmail(), personEntity.getAccountType());

       // return ResponseEntity.ok().header(HttpHeaders.AUTHORIZATION, jwt).build();
        //returonar json
        HashMap<String, String> jsonpObject = new HashMap<>();
        jsonpObject.put("token", jwt);
       // return ResponseEntity.ok(jsonpObject).header(HttpHeaders.AUTHORIZATION, jwt).build();

        //return jwt token on JSON




        return new ResponseEntity<>(jsonpObject, HttpStatus.OK);
    }

    }



