package com.cavalieri.noTasy.entities;

import com.cavalieri.noTasy.entities.enums.ProcedureType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_procedure")
public class Procedure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private ProcedureType procedureType;
    private String description;
    private String conclusion;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @OneToMany(mappedBy = "procedure")
    private List<ImageExam> images = new ArrayList<>();

//    public Procedure(){
//
//    }

//    public Procedure(Long id, ProcedureType procedureType, String description, String conclusion, Order order, List<ImageExam> images) {
//        this.id = id;
//        this.procedureType = procedureType;
//        this.description = description;
//        this.conclusion = conclusion;
//        this.order = order;
//        this.images = images;
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
//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
//
//    public List<ImageExam> getImages() {
//        return images;
//    }
//
//    public void setImages(List<ImageExam> images) {
//        this.images = images;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Procedure procedure = (Procedure) o;
        return Objects.equals(id, procedure.id) && procedureType == procedure.procedureType && Objects.equals(description, procedure.description) && Objects.equals(conclusion, procedure.conclusion) && Objects.equals(order, procedure.order) && Objects.equals(images, procedure.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, procedureType, description, conclusion, order, images);
    }

    @Override
    public String toString() {
        return "Procedure{" +
                "id=" + id +
                ", procedureType=" + procedureType +
                ", description='" + description + '\'' +
                ", conclusion='" + conclusion + '\'' +
                ", order=" + order +
                ", images=" + images +
                '}';
    }
}
