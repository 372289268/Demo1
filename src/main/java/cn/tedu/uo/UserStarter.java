package cn.tedu.uo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("cn.tedu.uo.mapper")
@ServletComponentScan
public class UserStarter extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(UserStarter.class);
    }
}
