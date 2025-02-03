package com.edenlisk.ubuvuzi.connect.controller;

import com.edenlisk.ubuvuzi.connect.entity.ApplicationUser;
import com.edenlisk.ubuvuzi.connect.entity.Permission;
import com.edenlisk.ubuvuzi.connect.entity.Role;
import com.edenlisk.ubuvuzi.connect.exception.ResourceNotFoundException;
import com.edenlisk.ubuvuzi.connect.repository.PermissionRepository;
import com.edenlisk.ubuvuzi.connect.repository.RoleRepository;
import com.edenlisk.ubuvuzi.connect.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
@AllArgsConstructor
public class UserController {
    private PermissionRepository permissionRepository;
    private RoleRepository roleRepository;
    private UserRepository userRepository;
    private PasswordEncoder passwordEncode;


    @GetMapping("/")
    public String helloUserController(){
//        Permission addHospitalPermission = new Permission();
//        addHospitalPermission.setAuthority("hospital:add");
//        Permission deleteHospitalPermission = new Permission();
//        deleteHospitalPermission.setAuthority("hospital:delete");
        var savedAdd = permissionRepository.findById(1).get();
        var savedDelete = permissionRepository.findById(2).get();
        Set<Permission> permissions = new HashSet<>();
        permissions.add(savedAdd);
        permissions.add(savedDelete);
//
//        if(roleRepository.findByName("ADMIN").isPresent()) return;
        Role adminRole = new Role();
        adminRole.setName("ADMIN");
        adminRole.setPermissions(permissions);
        Role savedAdminRole = roleRepository.save(adminRole);
        System.out.println(savedAdminRole);
//        Role userRole = new Role();
//        userRole.setName("USER");
//        userRole.setPermissions(permissions);
//        roleRepository.save(userRole);
//        Set<Permission> permissions = new HashSet<>(permissionRepository.findAll());
//        Role adminRole = roleRepository.findByName("ADMIN").orElseThrow(
//                () -> new ResourceNotFoundException("Role", "AUTHORITY", "ADMIN")
//        );
        Set<Role> roles = new HashSet<>();
        roles.add(adminRole);
//        ApplicationUser admin = new ApplicationUser(2, "admin", passwordEncode.encode("password"), roles);
//        ApplicationUser user = new ApplicationUser(2, "edenlisk", passwordEncode.encode("password"), roles);
//        userRepository.save(admin);
//        userRepository.save(user);
        return "User access level";
    }
    
}
