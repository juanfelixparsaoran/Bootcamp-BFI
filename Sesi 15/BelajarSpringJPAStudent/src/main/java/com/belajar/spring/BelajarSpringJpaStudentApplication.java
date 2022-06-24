package com.belajar.spring;


import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.model.Course;
import com.belajar.spring.model.Student;
import com.belajar.spring.repository.CourseRepository;
import com.belajar.spring.repository.StudentRepository;

@SpringBootApplication
public class BelajarSpringJpaStudentApplication implements CommandLineRunner{

	private final Logger Log = LoggerFactory.getLogger(BelajarSpringJpaStudentApplication.class);
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringJpaStudentApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		Student student = new Student("Bagoes Okta", 15);
		studentRepository.save(student);
		
		Course course1 = new Course("Beginning Spring Boot", 12, 1500);
		Course course2 = new Course("Beginning Spring Boot 2", 11, 1501);
		Course course3 = new Course("Beginning Spring Boot 3", 13, 1502);
		
		courseRepository.saveAll(Arrays.asList(course1, course2,course3));
		
		student.getCourses().addAll(Arrays.asList(course1, course2,course3));
		
		studentRepository.save(student);
		
		
	}
	
	

}
