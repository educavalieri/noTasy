package com.cavalieri.noTasy.services;

import com.cavalieri.noTasy.dtos.PatientDTO;
import com.cavalieri.noTasy.entities.Patient;
import com.cavalieri.noTasy.repositories.PatientRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService implements UserDetailsService {

    @Autowired
    private AuthService authService;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private ModelMapper modelMapper;

    private static Logger logger = LoggerFactory.getLogger(PatientService.class);


    @Transactional
    public List<PatientDTO> serviceFindAll(){
        List<Patient> entity = patientRepository.findAll();
//        List<PatientDTO> dto = entity.stream().map(x -> new PatientDTO(x, x.getOrders())).collect(Collectors.toList());
        List<PatientDTO> dto = entity.stream().map(x -> modelMapper.map(x, PatientDTO.class)).collect(Collectors.toList());
        return dto;
    }

    @Transactional
    public PatientDTO serviceFindById(Long id){
        Patient entity = patientRepository.findById(id).get();
//        return new PatientDTO(entity.getId(), entity.getName(), entity.getLastName(), entity.getCpf());
        PatientDTO dto = entityToDto(entity);
        return dto;
    }

    public PatientDTO entityToDto(Patient entity){
        return modelMapper.map(entity, PatientDTO.class);
    }


    @Transactional
    public PatientDTO findById(Long id){

        authService.validateSelfOrAdmin(id);

        Patient entity = patientRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found"));
        return new PatientDTO(entity);

    }


    //-----------------------------------------------------------------------------------
    //authentication zone:

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Patient patient = patientRepository.findByEmail(username);
        if (patient == null){
            logger.error("user not found " + username);
            throw new UsernameNotFoundException("email not found");
        }
        logger.info("user found" + username);
        return patient;
    }
}
