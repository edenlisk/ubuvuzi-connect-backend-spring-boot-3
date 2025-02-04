package com.edenlisk.ubuvuzi.connect.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable; /**
 * DTO for {@link com.edenlisk.ubuvuzi.connect.entity.Hospital}
 */
@Data @NoArgsConstructor
public class HospitalCreateDto implements Serializable {

    @NotEmpty(message = "Name of hospital cannot be null or empty")
    @Size(min = 3, max = 50, message = "Name of hospital must have 3 to 50 characters")
    private String nameOfHospital;

    @NotNull(message = "Address should be defined")
    private AddressDto address;

}
