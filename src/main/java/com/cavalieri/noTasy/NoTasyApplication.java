package com.cavalieri.noTasy;

import com.cavalieri.noTasy.entities.ImageExam;
import com.cavalieri.noTasy.entities.Order;
import com.cavalieri.noTasy.entities.Patient;
import com.cavalieri.noTasy.entities.Procedure;
import com.cavalieri.noTasy.entities.enums.ProcedureType;
import com.cavalieri.noTasy.repositories.ImageExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class NoTasyApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(NoTasyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Patient patient1 = new Patient();
//		Order order1 = new Order();
////		Procedure procedure1 = new Procedure();
////
//
//
////		List<ImageExam> listExam = new ArrayList<>();
//		ImageExam imageExam1 = new ImageExam(null, "url1", null);
//		ImageExam imageExam2 = new ImageExam(null, "url2", null);
////		listExam.add(imageExam1);
////		listExam.add(imageExam2);
////		Procedure procedure2 = new Procedure(null, ProcedureType.EXAM, "exame de rin", "nada consta", order1, listExam);
//		System.out.println("funfa");
//
//
//		repository.save(imageExam1);
//		repository.save(imageExam2);
	}
}




