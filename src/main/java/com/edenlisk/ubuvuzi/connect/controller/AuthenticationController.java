package com.edenlisk.ubuvuzi.connect.controller;

import com.edenlisk.ubuvuzi.connect.dto.ApplicationUserDto;
import com.edenlisk.ubuvuzi.connect.dto.LoginDto;
import com.edenlisk.ubuvuzi.connect.dto.LoginResponseDTO;
import com.edenlisk.ubuvuzi.connect.dto.RegistrationDto;
import com.edenlisk.ubuvuzi.connect.service.AuthenticationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
@AllArgsConstructor
public class AuthenticationController {

    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ApplicationUserDto registerUser(@RequestBody RegistrationDto registrationDto){
        return authenticationService.register(registrationDto);
    }
    
    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody LoginDto loginDto){
        return authenticationService.login(loginDto);
    }
}
