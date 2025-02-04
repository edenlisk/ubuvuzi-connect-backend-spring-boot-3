package com.edenlisk.ubuvuzi.connect.controller;


import com.edenlisk.ubuvuzi.connect.dto.CounterReferralDto;
import com.edenlisk.ubuvuzi.connect.dto.CreateCounterReferralDto;
import com.edenlisk.ubuvuzi.connect.dto.ResponseDto;
import com.edenlisk.ubuvuzi.connect.service.ICounterReferralService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/counter-referral", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
@AllArgsConstructor
public class CounterReferralController {

    private ICounterReferralService counterReferralService;

    @GetMapping("/{transferId}")
    public ResponseEntity<CounterReferralDto> getCounterReferral(@PathVariable("transferId") Long transferId) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(counterReferralService.getCounterReferralByTransfer(transferId));
    }

    @PostMapping
    public ResponseEntity<ResponseDto> createCounterReferral(@Valid @RequestBody CreateCounterReferralDto counterReferralDto) {
        counterReferralService.createCounterReferral(counterReferralDto);
        return ResponseEntity.
                status(HttpStatus.CREATED)
                .body(new ResponseDto("202", "Counter referral created successfully"));
    }

}
