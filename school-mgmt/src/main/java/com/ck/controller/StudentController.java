package com.ck.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ck.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	public void initList(Student student, Model model) {
		
		if(null == student) {
			student = new Student();
		}
		List<String> genderOptions = new ArrayList<String>();
		genderOptions.add("Male");
		genderOptions.add("Female");
		//Set Default Selection
		student.setGender("Male");
		student.setGenderOptions(genderOptions);
		
		List<String> coursesAvailable = new ArrayList<>();
		coursesAvailable.add("Java");
		coursesAvailable.add("Spring - Core");
		coursesAvailable.add("Spring - MVC");
		coursesAvailable.add("Spring - Microservices");
		coursesAvailable.add("Spring - Boot");
		coursesAvailable.add("Hibernate");
		coursesAvailable.add("Angular");
		student.setCoursesAvailable(coursesAvailable);
		
		model.addAttribute("student", student);
	}

	@GetMapping
	public String landingPage(Student student, Model model) {
		this.initList(null, model);
		return "registration";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("student") Student student, BindingResult theBindingResult,
			Model model) {
		
		if(theBindingResult.hasErrors()) {
			this.initList(student, model);
			return "registration";
		}
		
		model.addAttribute("student", student);
		return "confirm";
	}
}
