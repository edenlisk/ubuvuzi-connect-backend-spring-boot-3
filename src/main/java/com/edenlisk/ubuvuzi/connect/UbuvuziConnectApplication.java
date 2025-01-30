package com.edenlisk.ubuvuzi.connect;

import com.edenlisk.ubuvuzi.connect.entity.ApplicationUser;
import com.edenlisk.ubuvuzi.connect.entity.Permission;
import com.edenlisk.ubuvuzi.connect.entity.Role;
import com.edenlisk.ubuvuzi.connect.repository.PermissionRepository;
import com.edenlisk.ubuvuzi.connect.repository.RoleRepository;
import com.edenlisk.ubuvuzi.connect.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@EnableJpaAuditing(auditorAwareRef = "AuditAwareImpl")
@SpringBootApplication
public class UbuvuziConnectApplication {

    public static void main(String[] args) {
        SpringApplication.run(UbuvuziConnectApplication.class, args);
    }

//    @Bean
//    CommandLineRunner run(
//            RoleRepository roleRepository,
//            UserRepository userRepository,
//            PasswordEncoder passwordEncode,
//            PermissionRepository permissionRepository
//            ){
//        return args ->{
//
//
//        };
//    }//

}
