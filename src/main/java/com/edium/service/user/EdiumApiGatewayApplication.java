package com.edium.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EdiumApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdiumApiGatewayApplication.class, args);
    }
}
