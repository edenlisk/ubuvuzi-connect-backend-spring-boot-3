package com.edenlisk.ubuvuzi.connect.entity;

import com.edenlisk.ubuvuzi.connect.constants.Gender;
import com.edenlisk.ubuvuzi.connect.constants.Transportation;
import com.edenlisk.ubuvuzi.connect.constants.TypeOfTransfer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "transfer")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Transfer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="client_name", nullable = false)
    private String clientName;


    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "sex")
    private Gender sex;

    @Column(name = "caregiver_name")
    private String caregiverName;

    @Column(name = "caregiver_phone_number")
    private String caregiverPhoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @Column(name = "date_of_admission")
    private LocalDate dateOfAdmission;

    @Column(name = "date_of_transfer_decision")
    private LocalDate dateOfTransferDecision;

    // Referring facility (hospital issuing the transfer)
    @ManyToOne
    @JoinColumn(name = "referring_facility_id", nullable = false)
    private Hospital referringFacility;

    // Receiving facility (hospital receiving the patient)
    @ManyToOne
    @JoinColumn(name = "receiving_facility_id", nullable = false)
    private Hospital receivingFacility;


    // Employee at the receiving facility
    @ManyToOne
    @JoinColumn(name = "contacted_person_id", nullable = false)
    private Employee employee;

    private LocalTime callingTime;


    @Enumerated(EnumType.STRING)
    @Column(name = "type_of_transfer", nullable = false)
    private TypeOfTransfer typeOfTransfer;

    @Column(name = "ambulance_call_time")
    private LocalDateTime ambulanceCallTime;

    private LocalTime departureTime;

    @Column(nullable = false)
    private String transferReason;

    @Column(name = "clinical_presentation")
    private String clinicalPresentation;


    private String disabilityType;

    private Float temperature;

    // DESCRIPTIVE NAME
    private String spo2;

    // DESCRIPTIVE NAME
    private String rr;

    // DESCRIPTION
    private String pulse;

    // DESCRIPTIVE NAME
    private String bp;

    private Float weight;

    private Float height;

    // DESCRIPTIVE NAME
    private String muac;

    private String laboratoryAnalysis;

    private String diagnosis;

    private String proceduresAndTreatments;


    @Enumerated(EnumType.STRING)
    @Column(name = "type_of_transport")
    private Transportation typeOfTransport;

    private String otherTransportation;

    @ManyToOne
    @JoinColumn(name = "health_insurance_id", nullable = false)
    private HealthInsurance healthInsurance;

    private String otherHealthInsurance;

    private String healthCareProvider;

    private String qualification;

    @Column(name = "transfer_date")
    private LocalDate date;

    @Column(name = "transfer_time")
    private LocalTime time;

    private String phoneNumber;

    @OneToOne(mappedBy = "transfer", cascade = CascadeType.ALL)
    private ReferralFeedback referralFeedback;
}

