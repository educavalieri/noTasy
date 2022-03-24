package com.cavalieri.noTasy.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperPatientConfig {

    @Bean
    ModelMapper modelMapper(){

        return new ModelMapper();

    }
//
//    @Bean
//    ModelMapper modelMapperOrder(){
//
//        ModelMapper modelMapperOrder =
//        return modelMapperOrder()
//    }

}
