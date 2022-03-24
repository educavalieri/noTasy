package com.cavalieri.noTasy.dtos;

import com.cavalieri.noTasy.entities.Order;
import com.cavalieri.noTasy.entities.Patient;
import com.cavalieri.noTasy.entities.Procedure;
import com.cavalieri.noTasy.entities.enums.OrderStatus;
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
public class OrderDTO implements Serializable {

    private Long id;
    private OrderStatus orderStatus;
    private String patientDTO;
    private List<ProcedureDTO> proceduresDTO = new ArrayList<>();

//    public OrderDTO(){
//    }
//    public OrderDTO(Long id, OrderStatus orderStatus, PatientDTO patientDTO, List<ProcedureDTO> proceduresDTO) {
//        this.id = id;
//        this.orderStatus = orderStatus;
//        this.patientDTO = patientDTO;
//        this.proceduresDTO = proceduresDTO;
//    }
//
//    public OrderDTO(Order entity) {
//        id = entity.getId();
//        orderStatus = entity.getOrderStatus();
//        patientDTO = new PatientDTO(entity.getPatient());
//    }
//    public OrderDTO(Order entity, List<Procedure> procedures) {
//        this(entity);
//        entity.getProcedures().forEach(x -> this.proceduresDTO.add(new ProcedureDTO(x)));
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public OrderStatus getOrderStatus() {
//        return orderStatus;
//    }
//
//    public void setOrderStatus(OrderStatus orderStatus) {
//        this.orderStatus = orderStatus;
//    }
//
//    public PatientDTO getPatientDTO() {
//        return patientDTO;
//    }
//
//    public void setPatientDTO(PatientDTO patientDTO) {
//        this.patientDTO = patientDTO;
//    }
//
//    public List<ProcedureDTO> getProceduresDTO() {
//        return proceduresDTO;
//    }
//
//    public void setProceduresDTO(List<ProcedureDTO> proceduresDTO) {
//        this.proceduresDTO = proceduresDTO;
//    }
}
