package com.edenlisk.ubuvuzi.connect.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegistrationDto {

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

    @NotEmpty(message = "Please provide password")
    @Size(min = 4, max = 50, message = "Password must be of 4 to 50 characters long")
    private String password;

}
