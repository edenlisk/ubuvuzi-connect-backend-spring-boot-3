package com.edenlisk.ubuvuzi.connect.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data @NoArgsConstructor
public class CreateCounterReferralDto {

    @NotEmpty(message = "Health care provider should be provided")
    private Long userId;

    @NotEmpty(message = "Please provide the recommendations or follow-up care")
    private String recommendations;

    @NotEmpty(message = "Please provide referred back to facility")
    private Long referredBackToId;

    @NotEmpty(message = "Please provide counter referral date")
    private LocalDate date;

    @NotEmpty(message = "Please provide counter referral time")
    private LocalTime time;

    @NotEmpty(message = "Please select transfer for this counter referral")
    private Long transferId;
}
