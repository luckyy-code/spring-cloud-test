package cn.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@MapperScan("cn.cloud.mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class User {
    public static void main(String[] args) {
        SpringApplication.run(User.class, args);
    }
}