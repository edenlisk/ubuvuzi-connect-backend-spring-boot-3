package com.edenlisk.ubuvuzi.connect.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * DTO for {@link com.edenlisk.ubuvuzi.connect.entity.Address}
 */

@Data
@NoArgsConstructor
public class AddressDto {


    @NotEmpty(message = "Province can not be a null or empty")
    private String province;

    @NotEmpty(message = "District can not be a null or empty")
    private String district;

    @NotEmpty(message = "Sector can not be a null or empty")
    private String sector;

    @NotEmpty(message = "Cell can not be a null or empty")
    private String cell;

    @NotEmpty(message = "Village can not be a null or empty")
    private String village;
}