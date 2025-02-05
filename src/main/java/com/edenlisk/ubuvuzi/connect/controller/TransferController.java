package com.edenlisk.ubuvuzi.connect.controller;

import com.edenlisk.ubuvuzi.connect.dto.CreateTransferDto;
import com.edenlisk.ubuvuzi.connect.dto.ResponseDto;
import com.edenlisk.ubuvuzi.connect.dto.TransferDto;
import com.edenlisk.ubuvuzi.connect.service.ITransferService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/transfers", produces = "application/json")
@AllArgsConstructor
@Validated
public class TransferController {

    private ITransferService transferService;

    @PostMapping()
    public ResponseEntity<ResponseDto> createTransfer(@Valid @RequestBody CreateTransferDto createTransferDto) {
        transferService.createTransfer(createTransferDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto("202", "Transfer recorded successfully"));
    }


    @GetMapping("/{transferId}")
    public ResponseEntity<TransferDto> getTransferById(@Valid @PathVariable Long transferId) {
        TransferDto transferDto = transferService.getTransferById(transferId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(transferDto);
    }


    @GetMapping("/hospital/{hospitalId}")
    public ResponseEntity<List<TransferDto>> getTransfersByHospital(@Valid @PathVariable Long hospitalId) {
        List<TransferDto> transferDtos = transferService.getTransfersByHospital(hospitalId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(transferDtos);
    }


    @GetMapping("/healthcare-provider/{healthcareProviderId}")
    public ResponseEntity<List<TransferDto>> getTransfersByHealthcareProvider(@Valid @PathVariable Long healthcareProviderId) {
        System.out.println(healthcareProviderId);
        List<TransferDto> transferDtos = transferService.getTransfersByHealthcareProvider(healthcareProviderId);
        System.out.println(transferDtos);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(transferDtos);
    }

    @GetMapping("/patient/{phoneNumber}")
    public ResponseEntity<List<TransferDto>> getTransfersByPhoneNumber(@Valid @PathVariable String phoneNumber) {
        List<TransferDto> transferDtos = transferService.getPatientTransfersByPhoneNumber(phoneNumber);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(transferDtos);
    }

}
