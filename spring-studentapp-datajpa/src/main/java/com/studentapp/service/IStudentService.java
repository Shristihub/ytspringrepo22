package com.studentapp.service;

import java.util.List;

import com.studentapp.model.Student;

public interface IStudentService {

	void addStudent(Student student);
	List<Student> getAll();
	
}
