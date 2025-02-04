package com.edenlisk.ubuvuzi.connect.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

@Setter
@Entity
@Table(name = "permissions") @Getter @AllArgsConstructor @NoArgsConstructor
public class Permission implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String authority;

//    public Permission() {
//    }
//
//    public Permission(String authority) {
//        this.authority = authority;
//    }
//
//    @Override
//    public String getAuthority() {
//        return this.authority;
//    }
//
//    public Integer getId() {
//        return id;
//    }

}
