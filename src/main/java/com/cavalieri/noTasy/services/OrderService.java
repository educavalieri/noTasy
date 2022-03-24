package com.cavalieri.noTasy.services;

import com.cavalieri.noTasy.dtos.OrderDTO;
import com.cavalieri.noTasy.entities.Order;
import com.cavalieri.noTasy.repositories.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public List<OrderDTO> findAllService(){
        List<Order> entity = orderRepository.findAll();
        List<OrderDTO> dto = entity.stream().map(x -> modelMapper.map(x, OrderDTO.class )).collect(Collectors.toList());
        return dto;

    }


}
