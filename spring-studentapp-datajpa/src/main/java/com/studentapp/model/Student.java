package com.studentapp.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {
	private String name;
	@Id
	@GeneratedValue(generator = "student_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "student_gen", sequenceName = "student_seq", initialValue = 50, allocationSize = 1)
	private Integer studentId;
	private String department;
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name = "student_email",
					 joinColumns = @JoinColumn(name="student_id"))
	private Set<String> emails;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Student(String name, String department, Set<String> emails) {
		super();
		this.name = name;
		this.department = department;
		this.emails = emails;
	}


	public Set<String> getEmails() {
		return emails;
	}

	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", department=" + department + ", emails="
				+ emails + "]";
	}

	

}
