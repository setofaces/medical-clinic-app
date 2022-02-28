package ru.common.medicalclinicapp.core.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String gender;

    private int age;

    private String city;

    private String address;

    private LocalDate birthDayDt;

    private String birthPlace;

    private String registration;

    private int passportSeries;

    private int passportNumber;

    private String phoneNumber;

    private String anotherDocument;
}
