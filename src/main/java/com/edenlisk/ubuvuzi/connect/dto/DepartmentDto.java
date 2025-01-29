package com.edenlisk.ubuvuzi.connect.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.edenlisk.ubuvuzi.connect.entity.Department}
 */
@Data
public class DepartmentDto implements Serializable {

    private Long id;

    private String departmentName;

    private List<SubDepartmentDto> subDepartments;
}