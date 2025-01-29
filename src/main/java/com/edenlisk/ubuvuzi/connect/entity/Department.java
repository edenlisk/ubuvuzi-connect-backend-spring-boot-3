package com.edenlisk.ubuvuzi.connect.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "department")
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "department_name", nullable = false)
    private String departmentName;

//    @ManyToOne
//    @JoinColumn(name = "hospital_id", nullable = false)
//    private Hospital hospital;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubDepartment> subDepartments;
}
