package ru.common.medicalclinicapp.core.model.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Patient patient;

    private int docNumber;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime createDttm;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime modifyDttm;

    private String doctor;

    private String diagnosis;

    @OneToMany()
    @JoinColumn(referencedColumnName = "id")
    private List<MedicalHistory> medicalHistory;
}
