package ru.common.medicalclinicapp.core.service;

import ru.common.medicalclinicapp.core.dto.PatientDto;

import java.util.List;


public interface PatientService {
    PatientDto findById(Long id);

    void saveOrUpdate(PatientDto patientDto);

    List<PatientDto> findAll();

    void deleteById(Long id);
}
