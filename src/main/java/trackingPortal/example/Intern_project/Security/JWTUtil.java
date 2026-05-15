package trackingPortal.example.Intern_project.Security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTUtil {
    private final String SECRET = "mysecretkeymysecretkeymysecretkey12345";
 public String generateToken(String email){
     return Jwts.builder()
             .setSubject(email)
             .setIssuedAt(new Date())
             .setExpiration(new Date(System.currentTimeMillis()+1000*60*60))
             .signWith(Keys.hmacShaKeyFor(SECRET.getBytes()))
             .compact();

 }
 private String extractEmail(String token){
     return Jwts.parserBuilder()
             .setSigningKey(Keys.hmacShaKeyFor(SECRET.getBytes()))
             .build()
             .parseClaimsJws(token)
             .getBody()
             .getSubject();
 }
}
