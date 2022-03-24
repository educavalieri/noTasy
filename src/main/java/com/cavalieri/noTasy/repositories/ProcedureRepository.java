package com.cavalieri.noTasy.repositories;

import com.cavalieri.noTasy.dtos.ProcedureDTO;
import com.cavalieri.noTasy.entities.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProcedureRepository extends JpaRepository<Procedure, Long> {

//    @Query("SELECT DISTINCT obj FROM Procedure obj INNER JOIN obj.procedureType procType WHERE dtoType IN procType")
    @Query(nativeQuery = true, value = "SELECT * FROM tb_procedure WHERE tb_procedure.procedure_Type = :dtoType")
    List<Procedure> findByProcedureType(String dtoType);
}
