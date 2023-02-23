package com.example.demo.service;

import com.example.demo.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	
	public Student getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public Student getStudentByCity(String city);

}
