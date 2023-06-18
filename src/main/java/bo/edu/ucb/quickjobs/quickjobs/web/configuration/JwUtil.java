package bo.edu.ucb.quickjobs.quickjobs.web.configuration;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class JwUtil {

    private static String SECRET_KEY = "quickjobs";

    private static Algorithm ALGORITHM = Algorithm.HMAC256(SECRET_KEY);

    public String create(String email){
        return JWT.create()
                .withSubject(email)
                .withIssuer("ucb")
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(15)))
                .sign(ALGORITHM);
    }
}
