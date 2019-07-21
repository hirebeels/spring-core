package com.nh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = (Employee)context.getBean("employee");
		
		// 1
//		employee.getName();
		
//		System.out.println();
		
		// 2
//		employee.creatEmployee("def");
		
//		System.out.println();
		
		// 3
		try {
			employee.creatDuplicateEmployee("def");
			employee.creatDuplicateEmployee("def");
		} catch (Exception e) {
			System.out.println("Caught!!");
		}
		
//		
		
		
	}
}
