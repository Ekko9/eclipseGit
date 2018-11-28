package com.spring.service;

public class UserFactory {
	public static UserService getUs() {
		return new UserServiceImpl();
	}
	
	public  UserService getUs1() {
		return new UserServiceImpl();
	}
}
