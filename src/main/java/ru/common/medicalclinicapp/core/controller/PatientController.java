package ru.common.medicalclinicapp.core.controller;

import org.springframework.web.bind.annotation.*;
import ru.common.medicalclinicapp.core.dto.PatientDto;
import ru.common.medicalclinicapp.core.service.PatientService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/{id}")
    public PatientDto findById(@PathVariable Long id) {
        return patientService.findById(id);
    }

    @GetMapping
    public List<PatientDto> getAll() {
        return patientService.findAll();
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody @Valid PatientDto patientDto) {
        patientService.saveOrUpdate(patientDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        patientService.deleteById(id);
    }

}
