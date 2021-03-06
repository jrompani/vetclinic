package com.microservice.agenda.microserviceagenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceAgendaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceAgendaApplication.class, args);
    }

}
