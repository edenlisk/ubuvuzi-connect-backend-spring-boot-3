package com.edenlisk.ubuvuzi.connect.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "hospital")
@NoArgsConstructor
@AllArgsConstructor
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name_of_hospital", nullable = false)
    private String nameOfHospital;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

//    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "")
//    private List<Department> departments;

//    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<HospitalEmployee> employeeAssignments;
}
