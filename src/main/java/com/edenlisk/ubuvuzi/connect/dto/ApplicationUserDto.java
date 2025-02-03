package com.edenlisk.ubuvuzi.connect.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data @AllArgsConstructor @NoArgsConstructor
public class ApplicationUserDto {

    @NotEmpty(message = "Username cannot be null or empty")
    private String username;

    @NotEmpty(message = "Role cannot be null or empty")
    private String userRole;

    private Set<RoleDto> authorities;
}
