package com.edenlisk.ubuvuzi.connect.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class User {

    @Id
    private String id;

    private String firstName;

    private String lastName;


}
