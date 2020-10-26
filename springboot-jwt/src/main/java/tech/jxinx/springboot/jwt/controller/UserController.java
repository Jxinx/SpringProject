package tech.jxinx.springboot.jwt.controller;

import com.alibaba.fastjson.JSONObject;
import io.jsonwebtoken.Claims;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tech.jxinx.springboot.jwt.entity.User;
import tech.jxinx.springboot.jwt.util.JwtUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户接口
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    // 请求计数器
    private Integer reqCount = 1;

    /**
     * 根据手机号简单登录
     *
     * @param user
     * @return
     */
    @ResponseBody
    @PostMapping("/login")
    public JSONObject login(@RequestBody User user) {

        user.setUserId(reqCount);
        user.setName("Jxinx" + reqCount);
        user.setAge(18 + reqCount);
        user.setSex("男");

        String token = JwtUtils.geneJsonWebToken(user);

        JSONObject result = JSONObject.parseObject(JSONObject.toJSONString(user));
        result.put("token", token);

        reqCount++;
        return result;
    }

    /**
     * 校验token
     *
     * @param request
     * @return
     */
    @ResponseBody
    @PostMapping("/jwt")
    public JSONObject jwt(HttpServletRequest request) {

        //获取请求头中的token令牌
        String token = request.getHeader("token");

        Claims claims = JwtUtils.checkJWT(token);

        Integer userId = (Integer) claims.get("userId");
        String name = (String) claims.get("name");
        String phone = (String) claims.get("phone");

        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        user.setPhone(phone);

        logger.info("登录用户信息：" + user);

        JSONObject result = new JSONObject();
        result.put("code", 0);
        result.put("msg", "success");
        result.put("data", user);
        return result;
    }

}
