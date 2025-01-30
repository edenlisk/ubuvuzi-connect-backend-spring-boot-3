package com.edenlisk.ubuvuzi.connect.controller;


import com.edenlisk.ubuvuzi.connect.dto.RoleDto;
import com.edenlisk.ubuvuzi.connect.repository.RoleRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/roles", produces = MediaType.APPLICATION_JSON_VALUE)
public class RoleController {

    private final RoleRepository roleRepository;


    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @GetMapping("/all")
    public ResponseEntity<Set<RoleDto>> getAllRoles() {
//        Set<RoleDto> roles = new HashSet<>();
//        roles.add(new RoleDto(1, "ADMIN", new HashSet<>()));
//        roles.add(new RoleDto(2, "USER", new HashSet<>()));
//        System.out.println(roles);
//        return ResponseEntity.ok(roles);

//        return ResponseEntity.ok(roleRepository.findAll()
//                .stream()
//                .map(role -> new RoleDto(role.getRoleId(), role.getName(), role.getPermissions()))
//                .collect(Collectors.toSet()));
        return null;
    }

}
