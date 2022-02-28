package ru.common.medicalclinicapp.core.service.impl;

import org.springframework.stereotype.Service;
import ru.common.medicalclinicapp.core.dto.PatientDto;
import ru.common.medicalclinicapp.core.mapper.MapStructMapper;
import ru.common.medicalclinicapp.core.repository.PatientRepository;
import ru.common.medicalclinicapp.core.service.PatientService;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final MapStructMapper mapper;

    public PatientServiceImpl(PatientRepository patientRepository, MapStructMapper mapper) {
        this.patientRepository = patientRepository;
        this.mapper = mapper;
    }

    @Override
    public PatientDto findById(Long id) {
        return mapper.patientToPatientDto(patientRepository.findById(id).get());
    }

    @Override
    public void saveOrUpdate(PatientDto patientDto) {
        patientRepository.save(mapper.patientDtoToPatient(patientDto));
    }

    @Override
    public List<PatientDto> findAll() {
        return mapper.patientsToPatientDtos(patientRepository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        patientRepository.deleteById(id);
    }
}
