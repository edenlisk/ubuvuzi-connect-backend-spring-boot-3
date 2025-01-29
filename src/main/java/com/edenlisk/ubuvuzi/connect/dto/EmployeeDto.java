package com.edenlisk.ubuvuzi.connect.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.edenlisk.ubuvuzi.connect.entity.Employee}
 */
@Data
public class EmployeeDto implements Serializable {
    private Long id;

    @NotEmpty(message = "First name cannot be null or empty")
    private String firstName;

    @NotEmpty(message = "Last name cannot be null or empty")
    private String lastName;

    @NotEmpty(message = "Council Code cannot be null or empty")
    private String councilCode;

    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String phoneNumber;


    private List<HospitalEmployeeDto> hospitalAssignments;
}