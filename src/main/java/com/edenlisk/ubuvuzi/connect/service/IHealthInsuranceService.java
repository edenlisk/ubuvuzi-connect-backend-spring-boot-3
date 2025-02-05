package com.edenlisk.ubuvuzi.connect.service;


import com.edenlisk.ubuvuzi.connect.dto.CreateHealthInsuranceDto;
import com.edenlisk.ubuvuzi.connect.dto.HealthInsuranceDto;

import java.util.List;

public interface IHealthInsuranceService {

    void createHealthInsurance(CreateHealthInsuranceDto healthInsuranceDto);

    List<HealthInsuranceDto> getHealthInsurances();

}
