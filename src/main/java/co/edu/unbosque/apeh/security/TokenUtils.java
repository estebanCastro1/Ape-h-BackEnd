package co.edu.unbosque.apeh.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import java.security.Key;
import java.util.*;

public class TokenUtils {

    private final static  String ACCES_TOKEN_SECRET="gj2345fb44ofo2345ru44sd2734ncn54m83498h50670hnfd234jeierm23245";
    private final static  Long ACCES_TOKEN_VALIDITY_SECONDS= 2_592_000L;

    public static String createToken(String nombre,String email){
        long expirationTime = ACCES_TOKEN_VALIDITY_SECONDS*1000;
        Date expirationDate = new Date(System.currentTimeMillis()+expirationTime);
        Map<String, Object> extra = new HashMap<>();
        extra.put("nombre",nombre);
        return Jwts.builder()
                .setSubject(email)
                .setExpiration(expirationDate)
                .addClaims(extra)
                .signWith(Keys.hmacShaKeyFor(ACCES_TOKEN_SECRET.getBytes()))
                .compact();
    }
    public static UsernamePasswordAuthenticationToken getAuthentication(String token){

        try {
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(ACCES_TOKEN_SECRET.getBytes())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            String email = claims.getSubject();
            return  new UsernamePasswordAuthenticationToken(email,null, Collections.emptyList());
        }catch (JwtException e){
            return null;
        }
    }
}
