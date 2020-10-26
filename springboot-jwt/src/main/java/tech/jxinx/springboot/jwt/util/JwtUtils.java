package tech.jxinx.springboot.jwt.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import tech.jxinx.springboot.jwt.entity.User;

import java.util.Date;

/**
 * JWT工具类
 */
public class JwtUtils {
    public static final String SUBJECT = "admin";

    /**
     * 过期时间，毫秒：1分钟
     */
    public static final long EXPIRE = 1000 * 60;

    /**
     * 秘钥
     */
    public static final String APPSECRET = "dGVjaC5qeGlueC5zcHJpbmdib290LWp3dC5qd3QuQVBQU0VDUkVULScvQCEyai5xd18wIyMh";

    /**
     * 生成jwt
     */
    public static String geneJsonWebToken(User user) {

        String token = Jwts.builder().setHeaderParam("type", "JWT")
                .setSubject(SUBJECT)
                .claim("userId", user.getUserId())
                .claim("name", user.getName())
                .claim("phone", user.getPhone())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                .signWith(SignatureAlgorithm.HS256, APPSECRET).compact();

        return token;
    }


    /**
     * 校验token
     *
     * @param token
     * @return
     */
    public static Claims checkJWT(String token) {

        try {
            final Claims claims = Jwts.parser().setSigningKey(APPSECRET).parseClaimsJws(token).getBody();
            return claims;

        } catch (Exception e) {

        }
        return null;
    }
}