package com.edenlisk.ubuvuzi.connect.mapper;


import com.edenlisk.ubuvuzi.connect.dto.ApplicationUserDto;
import com.edenlisk.ubuvuzi.connect.dto.RegistrationDto;
import com.edenlisk.ubuvuzi.connect.dto.RoleDto;
import com.edenlisk.ubuvuzi.connect.entity.ApplicationUser;

public class ApplicationUserMapper {

    public static ApplicationUserDto mapToApplicationUserDto(ApplicationUser user, ApplicationUserDto userDto) {
        userDto.setId(user.getUserId());
//        userDto.setAuthorities(user.getAuthorities().stream().map(role -> RoleMapper.mapToRoleDto(role, new RoleDto())));
        userDto.setUsername(user.getUsername());
        userDto.setQualification(user.getQualification());
        userDto.setUserRole(user.getUserRole());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        return userDto;
    }

    public static ApplicationUser mapToApplicationUser(RegistrationDto userDto, ApplicationUser user) {
        user.setUserRole(String.valueOf(userDto.getUserRole()));
//        user.setPassword(userDto.getPassword());
        user.setUserRole(user.getUserRole());
        user.setQualification(userDto.getQualification());
        user.setUsername(userDto.getUsername());
        user.setLastName(userDto.getLastName());
        user.setFirstName(userDto.getFirstName());
        user.setPhoneNumber(userDto.getPhoneNumber());
        return user;
    }

}
