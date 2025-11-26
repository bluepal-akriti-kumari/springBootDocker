package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;



@Service
public class StudentService {
	
	@Autowired
	 public StudentRepository studentRepository;
	
	//create student
	public Student createStudent(Student student ) {
		return  studentRepository.save(student);
	}

	//get Student By Id
	public Student getStudentById(int id) {
		return studentRepository.findById(id).orElse(null);
	}
	
	//get All Student
	
	public List<Student>getAllStudents(){
		return studentRepository.findAll();
		
	}
	
	//update Student
	
	
	public Student updateStudent(int id, Student student) {
	    Student existingStudent = studentRepository.findById(id).orElse(null);

	    if (existingStudent != null) {
	        existingStudent.setName(student.getName());
	        existingStudent.setCity(student.getCity());

	        return studentRepository.save(existingStudent);
	    }
	    return null;
	}

	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
}
