package com.nh;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	
	@Bean
	User getUser(){
		User user =  new User();
		user.setName("ABC");
		return user;
	}

	@Bean
	@Scope("prototype")
	HelloWorld getHelloWorld() {
		HelloWorld helloWorld =  new HelloWorld();
		return helloWorld;
	}
	
	@Bean
	StoppedEventSubscriiber getStoppedEvent() {
		return new StoppedEventSubscriiber();

	}
}
