package com.edenlisk.ubuvuzi.connect.dto;

import com.edenlisk.ubuvuzi.connect.entity.Department;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data @NoArgsConstructor
public class HospitalDto {

    private Long id;

    @NotEmpty(message = "Name of hospital cannot be null or empty")
    @Size(min = 3, max = 50, message = "Name of hospital must have 3 to 50 characters")
    private String nameOfHospital;

    @NotNull(message = "Address should be defined")
    private AddressDto address;

    private List<Department> departments;
}