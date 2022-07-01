package com.microservice.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
@EnableConfigurationProperties
public class MicroserviceOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceOauthApplication.class, args);
    }

}
