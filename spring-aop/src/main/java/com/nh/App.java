package com.nh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = (Employee)context.getBean("employee");
		
//		employee.getName();
		
//		System.out.println();
		
//		employee.creatEmployee("def");
		
//		System.out.println();
		
		employee.creatDuplicateEmployee("def");
		employee.creatDuplicateEmployee("def");
//		
//		System.out.println(employee.getName());
//		
//		employee.creatDuplicateEmployee("def");
		/*
		 * try { employee.throwException(); } catch (Exception e) { // TODO
		 * Auto-generated catch block System.out.println("Caught!!!!!!"); }
		 */
		
		
	}
}
