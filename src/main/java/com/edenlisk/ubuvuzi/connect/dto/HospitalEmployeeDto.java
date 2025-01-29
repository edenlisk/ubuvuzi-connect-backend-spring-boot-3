package com.edenlisk.ubuvuzi.connect.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * DTO for {@link com.edenlisk.ubuvuzi.connect.entity.HospitalEmployee}
 */
@Data @NoArgsConstructor @AllArgsConstructor
public class HospitalEmployeeDto implements Serializable {

    private Long id;

    private HospitalDto hospital;

    private String role;

    private LocalDate startDate;

    private LocalDate endDate;

    private String shiftType;

    private List<DepartmentDto> departments;

    private List<SubDepartmentDto> subDepartments;
}