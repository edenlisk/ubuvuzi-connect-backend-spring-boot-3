package com.edenlisk.ubuvuzi.connect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing(auditorAwareRef = "AuditAwareImpl")
@SpringBootApplication
public class UbuvuziConnectApplication {

    public static void main(String[] args) {
        SpringApplication.run(UbuvuziConnectApplication.class, args);
    }

}
