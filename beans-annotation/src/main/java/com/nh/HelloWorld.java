package com.nh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class HelloWorld implements ApplicationListener<ContextStartedEvent>{

	@Autowired
	private User user;

	public HelloWorld() {
		System.out.println("Instance Created...");
	}
	
	public HelloWorld(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Context Started!!");
		
	}
	
}
