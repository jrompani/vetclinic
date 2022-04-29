package com.microservice.producto.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceProductoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProductoApplication.class, args);
    }

}
