package com.cavalieri.noTasy.controllers;


import com.cavalieri.noTasy.dtos.PatientDTO;
import com.cavalieri.noTasy.entities.Patient;
import com.cavalieri.noTasy.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "patients")
public class PatientResource {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public ResponseEntity<List<PatientDTO>> findAll(){
        List<PatientDTO> dto = patientService.serviceFindAll();
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<PatientDTO> findById(@PathVariable("id") Long id){
        PatientDTO dto = patientService.serviceFindById(id);
        return ResponseEntity.ok().body(dto);
    }


}
