package com.cavalieri.noTasy.repositories;

import com.cavalieri.noTasy.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findByEmail(String name);
}
