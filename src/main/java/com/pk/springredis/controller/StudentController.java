package com.pk.springredis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pk.springredis.model.Student;
import com.pk.springredis.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping("/ping")
	public ResponseEntity<String> ping() {
		return new ResponseEntity<String>("Success",HttpStatus.OK);
	}
	
	@PostMapping("/save-student")
	public ResponseEntity<Student> saveStudentDetails(@RequestBody Student student){
		return new ResponseEntity<Student>(service.saveStudent(student),HttpStatus.OK);
	}
	
	@GetMapping("/get-student/{studentId}")
	public ResponseEntity<Student> getStudentDetails(@PathVariable("studentId") int studentId){
		return new ResponseEntity<>(service.getStudentDetails(studentId),HttpStatus.FOUND);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Student>> getListOfAllStudents() {
		return new ResponseEntity<List<Student>>(service.getListOfAllStudents(),HttpStatus.FOUND);
	}
}
