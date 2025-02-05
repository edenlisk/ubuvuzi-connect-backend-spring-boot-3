package com.edenlisk.ubuvuzi.connect.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data @AllArgsConstructor @NoArgsConstructor
public class CreateReferralFeedbackDto {

    @NotNull(message = "Please provide date of admission at referred facility")
    private LocalDate dateOfAdmissionReferredFacility;

    @NotNull(message = "Please provide date of discharge")
    private LocalDate dateOfDischarge;

    @NotEmpty(message = "Please provide final diagnosis")
    private String finalDiagnosis;

    @NotEmpty(message = "Please provide treatments a patient at referred facility")
    private String treatmentAtReferredFacility;

    @NotNull(message = "Please provide the outcome")
    private Long outcomeId;

    @NotNull(message = "Please select transfer for this feedback")
    private Long transferId;
}
