package com.cavalieri.noTasy.config;

import com.cavalieri.noTasy.dtos.OrderDTO;
import com.cavalieri.noTasy.dtos.PatientDTO;
import com.cavalieri.noTasy.entities.Order;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperPatientConfig {


    @Bean
    ModelMapper modelMapper(){

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.createTypeMap(Order.class, OrderDTO.class).<String>addMapping(
                src -> src.getPatient().getName(),
                (x, y) -> x.setPatientDTO(y)
        );
        return modelMapper;
    }

}
