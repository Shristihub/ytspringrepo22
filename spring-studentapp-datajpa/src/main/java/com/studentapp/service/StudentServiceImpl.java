package com.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.model.Student;
import com.studentapp.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService{

	private IStudentRepository studentRepository;
	@Autowired
	public void setStudentRepository(IStudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}
	
	


	

}
