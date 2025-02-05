package com.edenlisk.ubuvuzi.connect.dto;

import com.edenlisk.ubuvuzi.connect.entity.ApplicationUser;
import lombok.*;

@Getter @AllArgsConstructor @Setter @NoArgsConstructor
public class LoginResponseDTO {
    private ApplicationUserDto user;
    private String jwt;

//    public LoginResponseDTO(){
//        super();
//    }

//    public LoginResponseDTO(ApplicationUser user, String jwt){
//        this.user = user;
//        this.jwt = jwt;
//    }

//    public void setUser(ApplicationUser user){
//        this.user = user;
//    }

//    public void setJwt(String jwt){
//        this.jwt = jwt;
//    }

}
