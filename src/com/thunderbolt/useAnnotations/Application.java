package com.thunderbolt.useAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("hybrid.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student student = (Student) context.getBean("student");
		student.printData();
	}

}
