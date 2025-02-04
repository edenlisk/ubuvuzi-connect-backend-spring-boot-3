package com.edenlisk.ubuvuzi.connect.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hospital_user_assignment")
public class HospitalEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private ApplicationUser healthcareProvider;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id", nullable = false)
    private Hospital hospital;

    @Column(name = "role")
    private String role;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "shift_type", nullable = false)
    private String shiftType;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "hospital_employee_department",
            joinColumns = @JoinColumn(name = "hospital_employee_id"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private List<Department> departments;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "hospital_employee_subdepartment",
            joinColumns = @JoinColumn(name = "hospital_employee_id"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private List<SubDepartment> subDepartments;

    @Column(name = "is_active")
    private Boolean isActive = true;
}

