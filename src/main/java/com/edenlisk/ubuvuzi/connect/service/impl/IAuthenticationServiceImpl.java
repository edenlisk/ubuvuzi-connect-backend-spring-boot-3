package com.edenlisk.ubuvuzi.connect.service.impl;

import com.edenlisk.ubuvuzi.connect.dto.ApplicationUserDto;
import com.edenlisk.ubuvuzi.connect.dto.LoginDto;
import com.edenlisk.ubuvuzi.connect.dto.LoginResponseDTO;
import com.edenlisk.ubuvuzi.connect.dto.RegistrationDto;
import com.edenlisk.ubuvuzi.connect.entity.ApplicationUser;
import com.edenlisk.ubuvuzi.connect.entity.Permission;
import com.edenlisk.ubuvuzi.connect.entity.Role;
import com.edenlisk.ubuvuzi.connect.mapper.ApplicationUserMapper;
import com.edenlisk.ubuvuzi.connect.repository.PermissionRepository;
import com.edenlisk.ubuvuzi.connect.repository.RoleRepository;
import com.edenlisk.ubuvuzi.connect.repository.UserRepository;
import com.edenlisk.ubuvuzi.connect.service.AuthenticationService;
import com.edenlisk.ubuvuzi.connect.service.TokenService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class IAuthenticationServiceImpl implements AuthenticationService {

    private UserRepository userRepository;

    private RoleRepository roleRepository;

    private PasswordEncoder passwordEncoder;

    private AuthenticationManager authenticationManager;

    private TokenService tokenService;

    private PermissionRepository permissionRepository;

//    public ApplicationUser registerUser(String username, String password){
//
//        String encodedPassword = passwordEncoder.encode(password);
////        Role userRole = roleRepository.findByName("USER").get();
//        Role adminRole = new Role();
//        adminRole.setName("ADMIN");
//        Set<Role> authorities = new HashSet<>();
//        Set<Permission> permissions = new HashSet<>(permissionRepository.findAll());
//        adminRole.setPermissions(permissions);
//        var saved = roleRepository.save(adminRole);
//        authorities.add(saved);
//        var user = new ApplicationUser();
//        user.setUsername(username);
//        user.setPassword(encodedPassword);
//        user.setAuthorities(authorities);
//
//        return userRepository.save(user);
//    }
//
//    public LoginResponseDTO loginUser(String username, String password){
//
//        try{
//            Authentication auth = authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(username, password)
//            );
//
//            String token = tokenService.generateJwt(auth);;
//
//            return new LoginResponseDTO(userRepository.findByUsername(username).get(), token);
//
//        } catch(AuthenticationException e){
//            return new LoginResponseDTO(null, "");
//        }
//    }

    /**
     * @param registrationDto
     * @return ApplicationUserDto
     */
    @Override
    public ApplicationUserDto register(RegistrationDto registrationDto) {
        String encodedPassword = passwordEncoder.encode(registrationDto.getPassword());
        Optional<Role> role = roleRepository.findByName(String.valueOf(registrationDto.getUserRole()));

        Set<Role> authorities = new HashSet<>();
        ApplicationUser user = ApplicationUserMapper.mapToApplicationUser(registrationDto, new ApplicationUser());
        user.setPassword(encodedPassword);
        if (role.isEmpty()) {
            Set<Permission> permissions = new HashSet<>();
            Role userRole = new Role();
            userRole.setPermissions(permissions);
            userRole.setName(String.valueOf(registrationDto.getUserRole()));
            userRole.setPermissions(permissions);
            var savedRole = roleRepository.save(userRole);
            authorities.add(savedRole);
        } else {
            authorities.add(role.get());
        }
//        Role userRole = roleRepository.findByName("USER").get();
//        var savedRole = roleRepository.findByName(String.valueOf(registrationDto.getUserRole())).get();
        user.setAuthorities(authorities);
        ApplicationUser savedUser = userRepository.save(user);
        return ApplicationUserMapper.mapToApplicationUserDto(savedUser, new ApplicationUserDto());
    }

    /**
     * @param loginDto
     * @return LoginResponseDto
     */
    @Override
    public LoginResponseDTO login(LoginDto loginDto) {

        try {
            Authentication auth = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword())
            );
            String token = tokenService.generateJwt(auth);
            ApplicationUser user = userRepository.findByUsername(loginDto.getUsername()).get();
//            user.setPassword(null);
//            LoginResponseDTO dto = new LoginResponseDTO(user, token);

            return new LoginResponseDTO(ApplicationUserMapper.mapToApplicationUserDto(user, new ApplicationUserDto()), token);

        } catch (AuthenticationException e) {
            return new LoginResponseDTO(null, null);
        }
    }
}
