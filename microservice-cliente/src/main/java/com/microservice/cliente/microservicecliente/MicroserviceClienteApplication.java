package com.microservice.cliente.microservicecliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceClienteApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceClienteApplication.class, args);
    }

}
