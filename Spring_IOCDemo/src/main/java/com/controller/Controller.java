package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.User;

public class Controller {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		User u1 = context.getBean("user", User.class);
		u1.setId(1);
		u1.setName("Varad");

		System.out.println(u1);
	}

}
