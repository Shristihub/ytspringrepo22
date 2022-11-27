package com.studentapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Student;
import com.studentapp.service.IStudentService;

@SpringBootApplication
public class SpringStudentappDatajpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringStudentappDatajpaApplication.class, args);
	}
	@Autowired
	private IStudentService studentService;
	
	@Override
	public void run(String... args) throws Exception {
	
		Set<String> emails = new HashSet<>(Arrays.asList("jo@gmail.com","jojo@gm.com"));
		Student student = new Student("Jo","CSE",emails);
//		studentService.addStudent(student);

		studentService.getAll().forEach(System.out::println);
		
	}

}
