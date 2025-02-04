package com.edenlisk.ubuvuzi.connect.controller;

import com.edenlisk.ubuvuzi.connect.dto.CreatePermissionDto;
import com.edenlisk.ubuvuzi.connect.dto.ResponseDto;
import com.edenlisk.ubuvuzi.connect.service.IPermissionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/permission")
public class PermissionController {

    private final IPermissionService permissionService;

    public PermissionController(IPermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createPermission(CreatePermissionDto permissionDto) {
        permissionService.createPermission(permissionDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDto("CREATED", "Permission created successfully"));
    }


}
