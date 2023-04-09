package com.example.hibernate.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "EMSI_STUDENTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "REGISTRATION_N",unique = true)
    private String registrationNumber;

    @Column(name = "NAME", length = 30,nullable = false)
    private String fullName;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    private Boolean stillActive;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lasteConnection;

}
