package cn.edu.guet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.edu.guet.mapper")
public class SccsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SccsApplication.class, args);
    }

}
