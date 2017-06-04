package com.thunderbolt.useHybrid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hybrid.xml");
		Student student = (Student) context.getBean("student");
		student.printData();
	}

}
