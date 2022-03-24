package com.cavalieri.noTasy.dtos;

import com.cavalieri.noTasy.entities.enums.ProcedureType;
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
public class ProcedureDTO implements Serializable {

    private Long id;

    private ProcedureType procedureType;
    private String description;
    private String conclusion;
    private OrderDTO orderDTO;
    private List<ImageExamDTO> images = new ArrayList<>();
//
//    public ProcedureDTO(){
//
//    }
//
//    public ProcedureDTO(Long id, ProcedureType procedureType, String description, String conclusion, OrderDTO orderDTO, List<ImageExamDTO> images) {
//        this.id = id;
//        this.procedureType = procedureType;
//        this.description = description;
//        this.conclusion = conclusion;
//        this.orderDTO = orderDTO;
//        this.images = images;
//    }
//
//    public ProcedureDTO(Procedure entity) {
//        id = entity.getId();
//        procedureType = entity.getProcedureType();
//        description = entity.getDescription();
//        conclusion = entity.getConclusion();
//        orderDTO = new OrderDTO(entity.getOrder());
//    }
//
//    public ProcedureDTO(Procedure entity, List<ImageExam> imageExamList) {
//        this(entity);
//        imageExamList.forEach(x -> this.images.add(new ImageExamDTO(x)));
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
//    public ProcedureType getProcedureType() {
//        return procedureType;
//    }
//
//    public void setProcedureType(ProcedureType procedureType) {
//        this.procedureType = procedureType;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getConclusion() {
//        return conclusion;
//    }
//
//    public void setConclusion(String conclusion) {
//        this.conclusion = conclusion;
//    }
//
//    public OrderDTO getOrderDTO() {
//        return orderDTO;
//    }
//
//    public void setOrderDTO(OrderDTO orderDTO) {
//        this.orderDTO = orderDTO;
//    }
//
//    public List<ImageExamDTO> getImages() {
//        return images;
//    }
//
//    public void setImages(List<ImageExamDTO> images) {
//        this.images = images;
//    }
}
