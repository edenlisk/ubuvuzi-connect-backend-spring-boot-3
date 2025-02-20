package com.edenlisk.ubuvuzi.connect.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * DTO for {@link com.edenlisk.ubuvuzi.connect.entity.CounterReferral}
 */
@Data
@NoArgsConstructor
public class CounterReferralDto implements Serializable {
    private Long id;

    @NotEmpty(message = "Please provide the recommendations or follow-up care")
    private String recommendations;



    private ApplicationUserDto healthCareProvider;

    @NotEmpty(message = "Please provide counter referral date")
    private LocalDate date;

    @NotEmpty(message = "Please provide counter referral time")
    private LocalTime time;

    @NotEmpty(message = "Please select transfer for this counter referral")
    private TransferDto transferDto;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}
