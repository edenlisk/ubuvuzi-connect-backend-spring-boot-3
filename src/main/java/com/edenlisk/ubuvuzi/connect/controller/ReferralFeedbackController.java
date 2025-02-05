package com.edenlisk.ubuvuzi.connect.controller;

import com.edenlisk.ubuvuzi.connect.dto.CreateReferralFeedbackDto;
import com.edenlisk.ubuvuzi.connect.dto.ReferralFeedbackDto;
import com.edenlisk.ubuvuzi.connect.dto.ResponseDto;
import com.edenlisk.ubuvuzi.connect.service.IReferralFeedbackService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/referral-feedback", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Validated
public class ReferralFeedbackController {

    private IReferralFeedbackService referralFeedbackService;


    @GetMapping("/{transferId}")
    public ResponseEntity<ReferralFeedbackDto> getReferralFeedbackByTransfer(@Valid @PathVariable Long transferId) {
        ReferralFeedbackDto referralFeedbackDto = referralFeedbackService.getReferralFeedbackByTransfer(transferId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(referralFeedbackDto);
    }

    @PostMapping("/new")
    public ResponseEntity<ResponseDto> createReferralFeedback(@RequestBody CreateReferralFeedbackDto referralFeedbackDto) {
        referralFeedbackService.createReferralFeedback(referralFeedbackDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto("202", "Referral feedback added successfully"));
    }

}
