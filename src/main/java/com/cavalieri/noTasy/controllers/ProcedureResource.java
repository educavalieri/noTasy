package com.cavalieri.noTasy.controllers;

import com.cavalieri.noTasy.dtos.ProcedureDTO;
import com.cavalieri.noTasy.dtos.ProcedureTypeDTO;
import com.cavalieri.noTasy.entities.Procedure;
import com.cavalieri.noTasy.services.ProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/procedures")

public class ProcedureResource {

    @Autowired
    private ProcedureService procedureService;

    @GetMapping
    public ResponseEntity<List<ProcedureDTO>> findAll(){
        List<ProcedureDTO> dto = procedureService.findAllService();
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProcedureDTO> findByID(@PathVariable("id") Long id){
        ProcedureDTO dto = procedureService.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping(value = "/procedureType")
    public ResponseEntity<List<ProcedureDTO>> findByProcedureType(@RequestBody ProcedureTypeDTO dtoType){
        List<ProcedureDTO> dto = procedureService.findByProcedureType(dtoType.getType());
        return ResponseEntity.ok().body(dto);

    }
}
