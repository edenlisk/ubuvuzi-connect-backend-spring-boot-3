package com.edenlisk.ubuvuzi.connect.mapper;

import com.edenlisk.ubuvuzi.connect.dto.CreateHealthInsuranceDto;
import com.edenlisk.ubuvuzi.connect.dto.HealthInsuranceDto;
import com.edenlisk.ubuvuzi.connect.entity.HealthInsurance;
import jakarta.validation.constraints.NotNull;

public class HealthInsuranceMapper {

    @NotNull
    public static HealthInsurance mapToInsurance(
            CreateHealthInsuranceDto healthInsuranceDto,
            HealthInsurance healthInsurance
    ) {
        healthInsurance.setDescription(healthInsuranceDto.getDescription());
        healthInsurance.setName(healthInsuranceDto.getName());
        return healthInsurance;
    }


    @NotNull
    public static HealthInsuranceDto mapToHealthInsuranceDto(
            HealthInsurance healthInsurance,
            HealthInsuranceDto healthInsuranceDto
    ) {
        healthInsuranceDto.setId(healthInsurance.getId());
        healthInsuranceDto.setDescription(healthInsurance.getDescription());
        healthInsuranceDto.setName(healthInsurance.getName());
        return healthInsuranceDto;
    }


}
