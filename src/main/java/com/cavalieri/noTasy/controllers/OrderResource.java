package com.cavalieri.noTasy.controllers;

import com.cavalieri.noTasy.dtos.OrderDTO;
import com.cavalieri.noTasy.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrderDTO>> findAll(){
        List<OrderDTO> dto = orderService.findAllService();
        return ResponseEntity.ok().body(dto);
    }


}
