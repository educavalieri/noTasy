package com.cavalieri.noTasy.services;

import com.cavalieri.noTasy.dtos.ProcedureDTO;
import com.cavalieri.noTasy.entities.Procedure;
import com.cavalieri.noTasy.entities.enums.ProcedureType;
import com.cavalieri.noTasy.repositories.ProcedureRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProcedureService {

    @Autowired
    private ProcedureRepository procedureRepository;

    @Autowired
    private ModelMapper modelMapper;



    @Transactional
    public List<ProcedureDTO> findAllService(){
        List<Procedure> entity = procedureRepository.findAll();
        List<ProcedureDTO> dto = entity.stream().map(x -> modelMapper.map(x, ProcedureDTO.class)).collect(Collectors.toList());
        return dto;
    }

    @Transactional
    public ProcedureDTO findById(Long id){
        Procedure entity = procedureRepository.findById(id).get();
        ProcedureDTO dto = modelMapper.map(entity, ProcedureDTO.class);
        return dto;
    }

    @Transactional
    public List<ProcedureDTO> findByProcedureType(String dtoType){
        List<Procedure> entity = procedureRepository.findByProcedureType(dtoType);
        List<ProcedureDTO> dto = entity.stream().map(x -> modelMapper.map(x, ProcedureDTO.class)).collect(Collectors.toList());
        return dto;
    }


}
