package tech.jxinx.springboot.jwt;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import tech.jxinx.springboot.jwt.interceptor.JWTInterceptor;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JWTInterceptor())
                .excludePathPatterns("/user/login") // 登录接口不用于token验证
                .addPathPatterns("/**");            // 其他非登录接口都需要进行token验证
    }
}