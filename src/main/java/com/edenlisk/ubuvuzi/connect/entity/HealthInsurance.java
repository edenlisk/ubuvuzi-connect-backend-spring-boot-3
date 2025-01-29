package com.edenlisk.ubuvuzi.connect.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "health_insurance")
@AllArgsConstructor @NoArgsConstructor
public class HealthInsurance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column( nullable = false)
    private String description;
}
