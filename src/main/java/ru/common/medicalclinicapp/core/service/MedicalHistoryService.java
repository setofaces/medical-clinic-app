package ru.common.medicalclinicapp.core.service;

import ru.common.medicalclinicapp.core.dto.MedicalHistoryDto;

import java.util.List;

public interface MedicalHistoryService {
    MedicalHistoryDto findById(Long id);

    List<MedicalHistoryDto> getAll();

    void deleteById(Long id);

    void saveOrUpdate(MedicalHistoryDto medicalHistoryDto);
}
