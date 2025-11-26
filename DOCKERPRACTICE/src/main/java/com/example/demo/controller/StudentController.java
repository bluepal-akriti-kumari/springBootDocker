package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;



@RestController
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping("/getstudent")
	public List<Student>getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById( @PathVariable int id) {
		return studentService.getStudentById(id);
	}

	@PutMapping("/studentUp/{id}")
	public Student updatestudent(@PathVariable int id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
	}
}
