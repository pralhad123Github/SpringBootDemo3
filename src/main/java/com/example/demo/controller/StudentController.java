package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		Student student1=studentService.saveStudent(student);
		return ResponseEntity.ok().body(student1);
		
	}
	@GetMapping("/get")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Integer id){
		Student student2=studentService.getStudentById(id);
		return ResponseEntity.ok().body(student2);
	}
	
	@DeleteMapping("/delete")
	public void deleteStudent(@PathVariable("id") Integer id) {
		studentService.deleteStudent(id);
	}
	
	@GetMapping("/get/{city}")
	public ResponseEntity<List<Student>> getStudentByCity(@PathVariable("city") String city){
	    List<Student> student=(List<Student>) studentService.getStudentByCity(city);
		return ResponseEntity.ok().body(student);
	}

}
