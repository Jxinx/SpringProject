package tech.jxinx.springboot.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJwtApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringbootJwtApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(SpringbootJwtApplication.class, args);
        } catch (Exception e) {
            logger.info("项目启动失败：{}", e.getMessage(), e);
        }
    }

}
