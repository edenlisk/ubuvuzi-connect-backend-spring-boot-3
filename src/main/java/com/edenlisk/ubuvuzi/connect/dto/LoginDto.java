package com.edenlisk.ubuvuzi.connect.dto;


import com.edenlisk.ubuvuzi.connect.constants.UserRole;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class LoginDto {

    @NotEmpty(message = "Username should be provided")
    private String username;

//    @NotEmpty(message = "User role should be specified")
//    private UserRole userRole;

    @NotEmpty(message = "Password should be provided")
    private String password;

}
