package com.edenlisk.ubuvuzi.connect.controller;

import com.edenlisk.ubuvuzi.connect.constants.HospitalConstants;
import com.edenlisk.ubuvuzi.connect.dto.HospitalCreateDto;
import com.edenlisk.ubuvuzi.connect.dto.HospitalDto;
import com.edenlisk.ubuvuzi.connect.dto.ResponseDto;
import com.edenlisk.ubuvuzi.connect.entity.Address;
import com.edenlisk.ubuvuzi.connect.service.IAddressService;
import com.edenlisk.ubuvuzi.connect.service.IHospitalService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/hospitals", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
@AllArgsConstructor
public class HospitalController {

    private IHospitalService hospitalService;

    @GetMapping("/{hospitalId}")
    public ResponseEntity<HospitalDto> getHospital(@Valid @PathVariable Long hospitalId) {
        HospitalDto hospitalDto = hospitalService.findById(hospitalId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(hospitalDto);
    }

    @PostMapping("")
    public ResponseEntity<ResponseDto> createHospital(@Valid @RequestBody HospitalCreateDto hospitalCreateDto) {
        hospitalService.create(hospitalCreateDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(HospitalConstants.STATUS_200, HospitalConstants.STATUS_200));
    }

}
