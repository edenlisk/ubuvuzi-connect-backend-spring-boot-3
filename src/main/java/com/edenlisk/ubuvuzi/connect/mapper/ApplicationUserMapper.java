package com.edenlisk.ubuvuzi.connect.mapper;


import com.edenlisk.ubuvuzi.connect.dto.ApplicationUserDto;
import com.edenlisk.ubuvuzi.connect.dto.RegistrationDto;
import com.edenlisk.ubuvuzi.connect.entity.ApplicationUser;

public class ApplicationUserMapper {

    public static ApplicationUserDto mapToApplicationUserDto(ApplicationUser user, ApplicationUserDto userDto) {
        userDto.setAuthorities(userDto.getAuthorities());
        userDto.setUsername(user.getUsername());
        userDto.setUserRole(user.getUserRole());
        return userDto;
    }

    public static ApplicationUser mapToApplicationUser(RegistrationDto userDto, ApplicationUser user) {
        user.setUserRole(String.valueOf(userDto.getUserRole()));
//        user.setPassword(userDto.getPassword());
        user.setUsername(userDto.getUsername());
        user.setLastName(userDto.getLastName());
        user.setFirstName(userDto.getFirstName());
        user.setPhoneNumber(userDto.getPhoneNumber());
        return user;
    }

}
