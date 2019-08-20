package com.ck.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Student {

	private String firstName;
	
	@NotEmpty(message = "is required")
	@Size(min = 2, message = "Length should be minimum 2 charecters")
	private String lastName;
	
	@NotEmpty(message = "is required")
	private String password;
	
	@Email(message = "Should be Valid EMail ID")
	private String email;
	
	@NotEmpty(message = "is required")
	private String gender;
	private List<String> genderOptions = new ArrayList();
	
	private List<String> coursesAvailable;
	
	@NotEmpty(message = "Select Atleast One Course!")
	private List<String> coursesInterested;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getGenderOptions() {
		return genderOptions;
	}

	public void setGenderOptions(List<String> genderOptions) {
		this.genderOptions = genderOptions;
	}

	public List<String> getCoursesAvailable() {
		return coursesAvailable;
	}

	public void setCoursesAvailable(List<String> coursesAvailable) {
		this.coursesAvailable = coursesAvailable;
	}

	public List<String> getCoursesInterested() {
		return coursesInterested;
	}

	public void setCoursesInterested(List<String> coursesInterested) {
		this.coursesInterested = coursesInterested;
	}
	
}
