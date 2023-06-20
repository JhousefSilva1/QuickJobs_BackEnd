package bo.edu.ucb.quickjobs.quickjobs.configuration;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class JwtUtil {

    private static String SECRET_KEY = "software";
    private static Algorithm ALGORITHM = Algorithm.HMAC256(SECRET_KEY);


    public String create(String email, String accountType, String names, String surnames){
        return JWT.create()
                .withSubject(email)
                .withClaim("accountType", accountType)
                .withClaim("names", names)
                .withClaim("surnames", surnames)
                .withIssuer("ucb")
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis()+ TimeUnit.DAYS.toMillis(1)))
                .sign(ALGORITHM);

    }

    public boolean isValid(String jwt){
        try{
            JWT.require(ALGORITHM)
                    .build()
                    .verify(jwt);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public String getEmail(String jwt){
        return JWT
                .require(ALGORITHM)
                .build()
                .verify(jwt)
                .getSubject();
    }
}
