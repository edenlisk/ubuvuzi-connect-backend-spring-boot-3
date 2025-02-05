package com.edenlisk.ubuvuzi.connect.controller;


import com.edenlisk.ubuvuzi.connect.dto.CreateHealthInsuranceDto;
import com.edenlisk.ubuvuzi.connect.dto.HealthInsuranceDto;
import com.edenlisk.ubuvuzi.connect.dto.ResponseDto;
import com.edenlisk.ubuvuzi.connect.service.IHealthInsuranceService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/health-insurances", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
@AllArgsConstructor
public class HealthInsuranceController {

    private IHealthInsuranceService healthInsuranceService;

    @GetMapping
    public ResponseEntity<List<HealthInsuranceDto>> getHealthInsurances() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(healthInsuranceService.getHealthInsurances());
    }

    @PostMapping
    public ResponseEntity<ResponseDto> createHealthInsurance(@Valid @RequestBody CreateHealthInsuranceDto healthInsuranceDto) {
        healthInsuranceService.createHealthInsurance(healthInsuranceDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto("202", "Health Insurance Created successfully"));
    }

}
