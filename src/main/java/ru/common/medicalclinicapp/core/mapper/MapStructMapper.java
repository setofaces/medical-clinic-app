package ru.common.medicalclinicapp.core.mapper;

import org.mapstruct.Mapper;
import ru.common.medicalclinicapp.core.dto.MedicalHistoryDto;
import ru.common.medicalclinicapp.core.dto.PatientDto;
import ru.common.medicalclinicapp.core.model.entity.MedicalHistory;
import ru.common.medicalclinicapp.core.model.entity.Patient;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructMapper {
    PatientDto patientToPatientDto(Patient patient);

    Patient patientDtoToPatient(PatientDto patientDto);

    List<PatientDto> patientsToPatientDtos(List<Patient> patients);

    MedicalHistoryDto medicalHistoryToMedicalHistoryDto(MedicalHistory medicalHistory);

    MedicalHistory MedicalHistoryDtoToMedicalHistory(MedicalHistoryDto medicalHistoryDto);

    List<MedicalHistoryDto> medicalHistoriesToMedicalHistoryDtos(List<MedicalHistory> medicalHistories);
}
