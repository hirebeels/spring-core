package com.nh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("hellowrld");
		System.out.println(helloWorld.getName());
		String name = helloWorld.getUser().getName();
		System.out.println("User Name " + name);

		HelloWorld helloWorld1 = (HelloWorld) context.getBean("hellowrld1");
		System.out.println(helloWorld1.getName());
		String name1 = helloWorld1.getUser().getName();
		System.out.println("User Name " + name1);

		HelloWorld helloWorld2 = (HelloWorld) context.getBean("hellowrld2");
		String name2 = helloWorld2.getUser().getName();
		System.out.println("User Name " + name2);

	}
}
