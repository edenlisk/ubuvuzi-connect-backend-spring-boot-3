package com.edenlisk.ubuvuzi.connect.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "sub_department")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SubDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "sub_department_name", nullable = false, unique = true)
    private String subDepartmentName;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;
}
