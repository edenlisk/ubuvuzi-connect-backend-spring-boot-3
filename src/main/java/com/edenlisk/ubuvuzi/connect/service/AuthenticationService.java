package com.edenlisk.ubuvuzi.connect.service;

import com.edenlisk.ubuvuzi.connect.dto.ApplicationUserDto;
import com.edenlisk.ubuvuzi.connect.dto.LoginDto;
import com.edenlisk.ubuvuzi.connect.dto.RegistrationDto;
import com.edenlisk.ubuvuzi.connect.entity.ApplicationUser;
import com.edenlisk.ubuvuzi.connect.dto.LoginResponseDTO;
import com.edenlisk.ubuvuzi.connect.entity.Permission;
import com.edenlisk.ubuvuzi.connect.entity.Role;
import com.edenlisk.ubuvuzi.connect.repository.PermissionRepository;
import com.edenlisk.ubuvuzi.connect.repository.RoleRepository;
import com.edenlisk.ubuvuzi.connect.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Transactional
@Service
public interface AuthenticationService {


    /**
     * @param registrationDto
     * @return ApplicationUserDto
     */
    ApplicationUserDto register(RegistrationDto registrationDto);


    /**
     * @param loginDto
     * @return LoginResponseDto
     */
    LoginResponseDTO login(LoginDto loginDto);

}


