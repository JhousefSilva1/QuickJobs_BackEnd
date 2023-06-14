package bo.edu.ucb.quickjobs.quickjobs.util;

import bo.edu.ucb.quickjobs.quickjobs.bl.SecurityBl;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;

import java.util.List;
import java.util.Map;

public class AuthUtil {

    public static String isPersonAuthenticated(String jwt){
        String subject = null;
        try {
            subject = JWT.require(Algorithm.HMAC256(SecurityBl.JWT_SECRET))
                    .build()
                    .verify(jwt)
                    .getSubject();
        } catch (JWTVerificationException ex) {
            throw new QuickJobsException("Usuario no autenticado");
        }
        return subject;
    }

    public static String getTokenFromHeader(Map<String, String> headers) {
        if (headers.get("Authorization") == null && headers.get("authorization") == null ) {
            throw new QuickJobsException("No se ha enviado el token de autorización");
        }
        // Se acostumbra que cuando se envia el token, se lo envia en el siguiente formato
        // Authorization: Bearer TOKEN
        String jwt = "";
        if (headers.get("Authorization") != null) {
            jwt = headers.get("Authorization").split(" ")[1];
        } else {
            jwt = headers.get("authorization").split(" ")[1];
        }
        return jwt;
    }
    /**
     * Recibimos el token JWT y verificamos si tiene un rol en particular
     * @param
     * @return true si tiene el rol y false si no lo tiene
     */
    public static boolean tokenHasRole(String jwt, String role) {
        List<String> roles = JWT.require(Algorithm.HMAC256(SecurityBl.JWT_SECRET))
                .build()
                .verify(jwt)
                .getClaim("roles").asList(String.class);
        return roles.contains(role);
    }

    /**
     * Recibimos el token JWT y verificamos si tiene un rol en particular, si no lo tiene se lanza excepción
     * @param
     */
    public static void verifyHasRole(String jwt, String role) {
        List<String> roles = JWT.require(Algorithm.HMAC256(SecurityBl.JWT_SECRET))
                .build()
                .verify(jwt)
                .getClaim("roles").asList(String.class);
        if(!roles.contains(role)) {
            throw new QuickJobsException("No tiene permisos para realizar esta acción");
        }
    }
}
