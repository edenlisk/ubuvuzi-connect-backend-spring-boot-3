package com.edenlisk.ubuvuzi.connect.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.io.Serializable;

/**
 * DTO for {@link com.edenlisk.ubuvuzi.connect.entity.SubDepartment}
 */
@Data
public class SubDepartmentDto implements Serializable {

    private Long id;

    @NotEmpty(message = "Sub department name cannot be null or empty")
    private String subDepartmentName;


    private DepartmentDto departmentDto;
}