package ru.common.medicalclinicapp.core.controller;


import org.springframework.web.bind.annotation.*;
import ru.common.medicalclinicapp.core.dto.MedicalHistoryDto;
import ru.common.medicalclinicapp.core.service.MedicalHistoryService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/medical")
public class MedicalHistoryController {

    private final MedicalHistoryService mhService;

    public MedicalHistoryController(MedicalHistoryService mhService) {

        this.mhService = mhService;
    }

    @GetMapping
    public List<MedicalHistoryDto> getAll() {
        return mhService.getAll();
    }

    @GetMapping("/{id}")
    public MedicalHistoryDto findById(@PathVariable Long id) {
        return mhService.findById(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody @Valid MedicalHistoryDto medicalHistoryDto) {
        mhService.saveOrUpdate(medicalHistoryDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        mhService.deleteById(id);
    }

}
