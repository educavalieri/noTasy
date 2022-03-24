package com.cavalieri.noTasy.services;

import com.cavalieri.noTasy.entities.Patient;
import com.cavalieri.noTasy.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.PermissionDeniedDataAccessException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AuthService {

    @Autowired
    private PatientRepository patientRepository;

    @Transactional
    public Patient Authenticated() {

        try {
            String userName = SecurityContextHolder.getContext().getAuthentication().getName();
            Patient patient = patientRepository.findByEmail(userName);
            return patient;
        }catch (Exception e){
            throw new UnsupportedOperationException("invalid user");
        }
    }

    public void validateSelfOrAdmin(Long userId){
        Patient patient = Authenticated();
        if (!patient.getId().equals(userId) && !patient.hasHole("ROLE_ADMIN")){
            throw new RuntimeException("Access denied");
        }


    }


}