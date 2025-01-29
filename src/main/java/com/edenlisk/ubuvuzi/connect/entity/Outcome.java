package com.edenlisk.ubuvuzi.connect.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter @NoArgsConstructor @AllArgsConstructor
@Table(name = "referral_outcome")
public class Outcome {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private String description;

}


