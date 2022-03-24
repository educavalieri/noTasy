package com.cavalieri.noTasy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_imagexam")
public class ImageExam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "procedure_id")
    private Procedure procedure;

//    public ImageExam(){
//
//    }
//
//    public ImageExam(Long id, String imageUrl, Procedure procedure) {
//        this.id = id;
//        this.imageUrl = imageUrl;
//        this.procedure = procedure;
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
//    public Procedure getProcedure() {
//        return procedure;
//    }
//
//    public void setProcedure(Procedure procedure) {
//        this.procedure = procedure;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ImageExam imageExam = (ImageExam) o;
//        return Objects.equals(id, imageExam.id) && Objects.equals(imageUrl, imageExam.imageUrl) && Objects.equals(procedure, imageExam.procedure);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imageUrl, procedure);
    }

    @Override
    public String toString() {
        return "ImageExam{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", procedure=" + procedure +
                '}';
    }
}
