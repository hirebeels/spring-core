package com.nh;

public class Employee {
	
	private String name;

	public String getName() {
		System.out.println("Inside Get Name");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmployee(){
		return this.name;
	}
	
	public void creatEmployee(String name) {
		this.name = name;
	}
	
	public void creatDuplicateEmployee(String name) throws Exception {
		if(this.name.equals(name)) {
			throw new Exception("Employee Already Created!.");
		}
		this.name = name;
	}
	
	public void throwException() throws Exception{
		throw new Exception("Custom Exception");
	}
	
}
