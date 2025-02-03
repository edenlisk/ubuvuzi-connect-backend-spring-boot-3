package com.edenlisk.ubuvuzi.connect.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "counter_referral")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CounterReferral extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String recommendations;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id", nullable = false)
    private Hospital hospital;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "healthcare_provider_id", nullable = false)
    private ApplicationUser healthCareProvider;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_person_id", nullable = false)
    private ApplicationUser contactPerson;

    @Column(name = "counter_referral_date")
    private LocalDate date;

    @Column(name = "counter_referral_time")
    private LocalTime time;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "transfer_id", referencedColumnName = "id", nullable = false)
    private Transfer transfer;

}
