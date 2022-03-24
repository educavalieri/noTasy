package com.cavalieri.noTasy.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImageExamDTO implements Serializable {

    private Long id;
    private String imageUrl;
    private ProcedureDTO procedureDTO;

//    public ImageExamDTO(){
//    }
//
//    public ImageExamDTO(Long id, String imageUrl, ProcedureDTO procedureDTO) {
//        this.id = id;
//        this.imageUrl = imageUrl;
//        this.procedureDTO = procedureDTO;
//    }
//
//    public ImageExamDTO(ImageExam entity) {
//        id = entity.getId();
//        imageUrl = entity.getImageUrl();
//        procedureDTO = new ProcedureDTO(entity.getProcedure());
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
//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//
//    public ProcedureDTO getProcedureDTO() {
//        return procedureDTO;
//    }
//
//    public void setProcedureDTO(ProcedureDTO procedureDTO) {
//        this.procedureDTO = procedureDTO;
//    }
}
