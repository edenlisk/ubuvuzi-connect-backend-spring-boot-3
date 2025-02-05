package com.edenlisk.ubuvuzi.connect.dto;

import com.edenlisk.ubuvuzi.connect.constants.Gender;
import com.edenlisk.ubuvuzi.connect.constants.Transportation;
import com.edenlisk.ubuvuzi.connect.constants.TypeOfTransfer;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
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

    @NotEmpty(message = "Please provide district")
    private String district;

    @NotEmpty(message = "Please provide sector")
    private String sector;

    @NotEmpty(message = "Please provide cell")
    private String cell;

    @NotEmpty(message = "Please provide village")
    private String village;

//    @NotEmpty(message = "Please select gender")
    private Gender gender;

    @NotEmpty(message = "Please provide caregiver name")
    private String caregiverName;

    @NotEmpty(message = "Please provide caregiver phone number")
    private String caregiverPhoneNumber;

    @PastOrPresent(message = "Please provide date of admission of patient")
    private LocalDate dateOfAdmission;

    @PastOrPresent(message = "Please provide date of transfer decision")
    private LocalDate dateOfTransferDecision;

    @NotNull(message = "Please select the referral hospital")
    private Long referralFacilityId;

    @NotNull(message = "Please select the receiving hospital")
    private Long receivingFacilityId;

    @NotNull(message = "Please select the receiving Service")
    private Long receivingServiceId;

    @NotNull(message = "Please provide health care provider transferring patient")
    private Long contactedPerson;

//    @NotEmpty(message = "Please provide calling time")
    private LocalTime callingTime;

    @NotNull(message = "Please select type of transfer")
    private TypeOfTransfer typeOfTransfer;

    @NotNull(message = "Please provide ambulance call time")
    private LocalDateTime ambulanceCallTime;

//    @NotEmpty(message = "Please provider departure time")
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

//    @NotEmpty(message = "Please select type of transportation used")
    private Transportation typeOfTransport;


    private String otherTransportation;

    @NotNull(message = "Please select health insurance")
    private Long healthInsuranceId;


    private String otherHealthInsurance;

    @NotNull(message = "Please provider health care provider transferring patient")
    private Long healthCareProviderId;

    @NotNull(message = "Please provide date of transfer")
    private LocalDate date;

    @NotNull(message = "Please provide time of transfer")
    private LocalTime time;


//    private String phoneNumber;
    
}
