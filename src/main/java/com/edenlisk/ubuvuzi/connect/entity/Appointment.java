package com.edenlisk.ubuvuzi.connect.entity;


import com.edenlisk.ubuvuzi.connect.constants.AppointmentStatus;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String patientName;

    @Column(nullable = false)
    private String patientId;

    @Column(nullable = false)
    private String doctorName;

    @Column(nullable = false)
    private String doctorId;

    @Column(nullable = false)
    private LocalDateTime appointmentDate;

    @Column(nullable = false)
    private String department;

    private String reasonForVisit;

    private String notes;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

//    @Column(nullable = true)
//    private LocalDateTime createdAt;
//
//    @Column(nullable = true)
//    private LocalDateTime updatedAt;


}
