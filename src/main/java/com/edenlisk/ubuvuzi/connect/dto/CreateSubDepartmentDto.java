package com.edenlisk.ubuvuzi.connect.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class CreateSubDepartmentDto {

    @NotEmpty(message = "Sub department name cannot be null or empty")
    private String subDepartmentName;


    private Long departmentId;

}
