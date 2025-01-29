package com.edenlisk.ubuvuzi.connect.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "transfer_feedback")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ReferralFeedback extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private LocalDate dateOfAdmissionReferredFacility;

    private LocalDate dateOfDischarge;

    private String finalDiagnosis;

    private String treatmentAtReferredFacility;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "outcome_id", referencedColumnName = "id", nullable = false)
    private Outcome outcome;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "transfer_id", referencedColumnName = "id", nullable = false)
    private Transfer transfer;

}
