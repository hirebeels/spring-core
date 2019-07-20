package com.nh;

public class HelloWorld {

	private String name;
	private User user;

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	
	public HelloWorld(User user) {
		super();
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
