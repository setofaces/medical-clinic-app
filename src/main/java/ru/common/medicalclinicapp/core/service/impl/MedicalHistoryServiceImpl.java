package ru.common.medicalclinicapp.core.service.impl;

import org.springframework.stereotype.Service;
import ru.common.medicalclinicapp.core.dto.MedicalHistoryDto;
import ru.common.medicalclinicapp.core.mapper.MapStructMapper;
import ru.common.medicalclinicapp.core.repository.MedicalHistoryRepository;
import ru.common.medicalclinicapp.core.service.MedicalHistoryService;

import java.util.List;

@Service
public class MedicalHistoryServiceImpl implements MedicalHistoryService {

    private final MedicalHistoryRepository repository;
    private final MapStructMapper mapper;

    MedicalHistoryServiceImpl(MedicalHistoryRepository repository, MapStructMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public MedicalHistoryDto findById(Long id) {
        return mapper.medicalHistoryToMedicalHistoryDto(repository.findById(id).get());
    }

    @Override
    public List<MedicalHistoryDto> getAll() {
        return mapper.medicalHistoriesToMedicalHistoryDtos(repository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void saveOrUpdate(MedicalHistoryDto medicalHistoryDto) {
        repository.save(mapper.MedicalHistoryDtoToMedicalHistory(medicalHistoryDto));
    }
}
