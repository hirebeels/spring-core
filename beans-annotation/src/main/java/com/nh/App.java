package com.nh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		context.start();
		
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		
//		context.refresh();
		/*
		 * helloWorld = context.getBean(HelloWorld.class); helloWorld =
		 * context.getBean(HelloWorld.class); helloWorld =
		 * context.getBean(HelloWorld.class); helloWorld =
		 * context.getBean(HelloWorld.class);
		 */
		
		System.out.println(helloWorld.getUser().getName());
		
		context.stop();
	}
}
