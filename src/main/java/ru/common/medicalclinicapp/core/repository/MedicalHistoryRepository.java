package ru.common.medicalclinicapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.common.medicalclinicapp.core.model.entity.MedicalHistory;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {
}
