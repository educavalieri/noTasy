package com.cavalieri.noTasy.dtos;

import com.cavalieri.noTasy.entities.Patient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientDTO implements Serializable {

    private Long id;

    private String name;
    private String lastName;
    private String cpf;
    private String email;
    private List<OrderDTO> orders = new ArrayList<>();

//    public PatientDTO() {
//
//    }
//
//    public PatientDTO(Long id, String name, String lastName, String cpf) {
//        this.id = id;
//        this.name = name;
//        this.lastName = lastName;
//        this.cpf = cpf;
//    }
//
//
//    public PatientDTO(Long id, String name, String lastName, String cpf, List<OrderDTO> orders) {
//        this.id = id;
//        this.name = name;
//        this.lastName = lastName;
//        this.cpf = cpf;
//        this.orders = orders;
//    }
//
//    public PatientDTO(Patient entity, List<Order> orders) {
//        this.id = entity.getId();
//        this.name = entity.getName();
//        this.lastName = entity.getLastName();
//        this.cpf = entity.getCpf();
//        orders.forEach(x -> this.orders.add(new OrderDTO(x)));
////        orders.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
//
//    }
//
    public PatientDTO(Patient entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.lastName = entity.getLastName();
        this.cpf = entity.getCpf();
    }
////
////    public PatientDTO(Patient entity) {
////        this.id = entity.getId();
////        this.name = entity.getName();
////        this.lastName = entity.getLastName();
////        this.cpf = entity.getCpf();
//////        entity.getOrders().forEach(x -> this.orders.add(new OrderDTO(x)));
////        entity.getOrders().stream().map(x -> this.orders.add(new OrderDTO(x))).collect(Collectors.toList());
////
////    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
//
//    public List<OrderDTO> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(List<OrderDTO> orders) {
//        this.orders = orders;
//    }
}
