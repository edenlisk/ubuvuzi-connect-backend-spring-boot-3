package com.edenlisk.ubuvuzi.connect.dto;

import com.edenlisk.ubuvuzi.connect.constants.Gender;
import com.edenlisk.ubuvuzi.connect.constants.Transportation;
import com.edenlisk.ubuvuzi.connect.constants.TypeOfTransfer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * DTO for {@link com.edenlisk.ubuvuzi.connect.entity.Transfer}
 */
@Data
public class TransferDto implements Serializable {

    private Long id;
    private String clientName;
    private String serialNumber;
    private LocalDate dateOfBirth;
    private Gender sex;
    private String caregiverName;
    private String caregiverPhoneNumber;
    private AddressDto address;
    private LocalDate dateOfAdmission;
    private LocalDate dateOfTransferDecision;
    private HospitalDto referringFacility;
    private HospitalDto receivingFacility;
    private EmployeeDto employee;
    private LocalTime callingTime;
    private TypeOfTransfer typeOfTransfer;
    private LocalDateTime ambulanceCallTime;
    private LocalTime departureTime;
    private String transferReason;
    private String clinicalPresentation;
    private String disabilityType;
    private Float temperature;
    private String spo2;
    private String rr;
    private String pulse;
    private String bp;
    private Float weight;
    private Float height;
    private String muac;
    private String laboratoryAnalysis;
    private String diagnosis;
    private String proceduresAndTreatments;
    private Transportation typeOfTransport;
    private String otherTransportation;
    private HealthInsuranceDto healthInsurance;
    private String otherHealthInsurance;
    private String healthCareProvider;
    private String qualification;
    private LocalDate date;
    private LocalTime time;
    private String phoneNumber;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}