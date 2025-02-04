package com.edenlisk.ubuvuzi.connect.dto;

import com.edenlisk.ubuvuzi.connect.constants.Gender;
import com.edenlisk.ubuvuzi.connect.constants.Transportation;
import com.edenlisk.ubuvuzi.connect.constants.TypeOfTransfer;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data @AllArgsConstructor @NoArgsConstructor
public class CreateTransferDto {

    @NotEmpty(message = "Patient name should be provided")
    private String clientName;

    @NotEmpty(message = "Please provide serial number")
    private String serialNumber;

    private LocalDate dateOfBirth;

    @NotEmpty(message = "Please select gender")
    private Gender gender;

    @NotEmpty(message = "Please provide caregiver name")
    private String caregiverName;

    @NotEmpty(message = "Please provide caregiver phone number")
    private String caregiverPhoneNumber;

    @NotEmpty(message = "Please provide date of admission of patient")
    private LocalDate dateOfAdmission;

    @NotEmpty(message = "Please provide date of transfer decision")
    private LocalDate dateOfTransferDecision;

    @NotEmpty(message = "Please select the referral hospital")
    private Long referralFacilityId;

    @NotEmpty(message = "Please select the receiving hospital")
    private Long receivingFacilityId;

    @NotEmpty(message = "Please provide health care provider transferring patient")
    private Long contactedPerson;

    @NotEmpty(message = "Please provide calling time")
    private LocalTime callingTime;

    @NotEmpty(message = "Please select type of transfer")
    private TypeOfTransfer typeOfTransfer;

    @NotEmpty(message = "Please provide ambulance call time")
    private LocalDateTime ambulanceCallTime;

    @NotEmpty(message = "Please provider departure time")
    private LocalTime departureTime;

    @NotEmpty(message = "Please provide reasons of transfer")
    private String transferReason;

    @NotEmpty(message = "Please provide clinical presentation")
    private String clinicalPresentation;

    private String disabilityType;


    private Float temperature;

    private Float spo2;

    private Float rr;

    private Float pulse;

    private Float bp;

    private Float weight;

    private Float height;

    private String muac;

    private String laboratoryAnalysis;

    private String diagnosis;

    private String proceduresAndTreatment;

    @NotEmpty(message = "Please select type of transportation used")
    private Transportation typeOfTransport;


    private String otherTransportation;

    @NotEmpty(message = "Please select health insurance")
    private Long healthInsuranceId;


    private String otherHealthInsurance;

    @NotEmpty(message = "Please provider health care provider transferring patient")
    private Long healthCareProviderId;

    @NotEmpty(message = "Please provide date of transfer")
    private LocalDate date;

    @NotEmpty(message = "Please provide time of transfer")
    private LocalTime time;


//    private String phoneNumber;
    
}
