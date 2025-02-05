package com.edenlisk.ubuvuzi.connect.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.edenlisk.ubuvuzi.connect.entity.ReferralFeedback}
 */
@Data
public class ReferralFeedbackDto implements Serializable {
    private Long id;

    @NotEmpty(message = "Please provide date of admission at referred facility")
    private LocalDate dateOfAdmissionReferredFacility;

    @NotEmpty(message = "Please provide date of discharge")
    private LocalDate dateOfDischarge;

    @NotEmpty(message = "Please provide final diagnosis")
    private String finalDiagnosis;

    @NotEmpty(message = "Please provide treatments a patient at referred facility")
    private String treatmentAtReferredFacility;

    @NotNull(message = "Please provide the outcome")
    private OutcomeDto outcome;

    @NotNull(message = "Please select transfer for this feedback")
    private TransferDto transfer;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}