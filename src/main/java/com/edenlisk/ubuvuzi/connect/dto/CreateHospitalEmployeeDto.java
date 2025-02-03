package com.edenlisk.ubuvuzi.connect.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data @AllArgsConstructor @NoArgsConstructor
public class CreateHospitalEmployeeDto {

    @NotEmpty(message = "UserId should not be empty or null")
    private Long userId;

    @NotEmpty(message = "Hospital should not be empty or null")
    private Long hospitalId;

    @NotEmpty(message = "Please select departments")
    private Set<Long> departments;

}
