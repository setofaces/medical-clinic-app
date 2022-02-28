package ru.common.medicalclinicapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.common.medicalclinicapp.core.model.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
