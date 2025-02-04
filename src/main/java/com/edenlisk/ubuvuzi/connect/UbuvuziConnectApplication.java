package com.edenlisk.ubuvuzi.connect;

import com.edenlisk.ubuvuzi.connect.entity.ApplicationUser;
import com.edenlisk.ubuvuzi.connect.entity.Outcome;
import com.edenlisk.ubuvuzi.connect.entity.Permission;
import com.edenlisk.ubuvuzi.connect.entity.Role;
import com.edenlisk.ubuvuzi.connect.repository.IOutcomeRepository;
import com.edenlisk.ubuvuzi.connect.repository.PermissionRepository;
import com.edenlisk.ubuvuzi.connect.repository.RoleRepository;
import com.edenlisk.ubuvuzi.connect.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EnableJpaAuditing(auditorAwareRef = "AuditAwareImpl")
@SpringBootApplication
public class UbuvuziConnectApplication {

    public static void main(String[] args) {
        SpringApplication.run(UbuvuziConnectApplication.class, args);
    }

//    @Bean
//    CommandLineRunner run(
//            IOutcomeRepository outcomeRepository
//            ){
//        return args ->{
//            Outcome outcome1 = new Outcome();
//            outcome1.setName("Cured");
//            outcome1.setDescription("Cured/Stabilized");
//
//            Outcome out2 = new Outcome();
//            out2.setName("Died");
//            out2.setDescription("Died");
//
//            Outcome out3 = new Outcome();
//            out3.setName("Escaped");
//            out3.setDescription("Escaped");
//
//
//            Outcome out4 = new Outcome();
//            out4.setName("To be followed up");
//            out4.setDescription("To be followed up");
//
//            Outcome out5 = new Outcome();
//            out5.setName("Referred to high level");
//            out5.setDescription("Referred to high level");
//
//            List<Outcome> outcomes = new ArrayList<>();
//            outcomes.add(outcome1);
//            outcomes.add(out2);
//            outcomes.add(out3);
//            outcomes.add(out4);
//            outcomes.add(out5);
//            outcomeRepository.saveAll(outcomes);
//        };
//    }

    @Bean
    CommandLineRunner run(
            UserRepository userRepository,
            PermissionRepository permissionRepository,
            RoleRepository roleRepository,
            PasswordEncoder passwordEncoder
    ) {
        return args -> {
            Permission permission = new Permission();
            permission.setAuthority("hospitals:view");
            var savedPermissions = permissionRepository.save(permission);

            Permission permission2 = new Permission();
            permission2.setAuthority("users:view");

            var savedPermission2 = permissionRepository.save(permission);


            Permission permission3 = new Permission();
            permission3.setAuthority("departments:view");

            var savedPermission3 = permissionRepository.save(permission);


            var myPermissions = new HashSet<Permission>();
            myPermissions.add(savedPermissions);
            myPermissions.add(savedPermission2);
            myPermissions.add(savedPermission3);

            Role userRole = new Role();
            userRole.setName("DOCTOR");
            userRole.setPermissions(myPermissions);
            var savedRole = roleRepository.save(userRole);

            var roles = new HashSet<Role>();
            roles.add(savedRole);
            ApplicationUser user = new ApplicationUser();
            user.setUsername("12345");
            user.setPassword(passwordEncoder.encode("password"));
            user.setFirstName("Murinzi");
            user.setLastName("Edgar Alexander");
            user.setQualification("DOCTOR");
            user.setPhoneNumber("+250786957549");
            user.setAuthorities(roles);
            userRepository.save(user);

        };
    }

}


