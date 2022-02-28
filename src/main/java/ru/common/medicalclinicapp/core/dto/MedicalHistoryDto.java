package ru.common.medicalclinicapp.core.dto;

import lombok.Data;
import ru.common.medicalclinicapp.core.model.entity.MedicalHistory;
import ru.common.medicalclinicapp.core.model.entity.Patient;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
public class MedicalHistoryDto {

    @NotEmpty
    private Patient patient;

    @NotNull
    private int docNumber;

    @NotNull
    private LocalDateTime createDttm;

    @NotNull
    private LocalDateTime modifyDttm;

    private String doctor;

    private String diagnosis;

    private ArrayList<MedicalHistory> medicalHistory;
}
