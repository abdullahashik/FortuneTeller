package com.thunderbolt.useAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class SpringConfig {

	FortuneTellerImpl fortune;

	@Bean(name = "fortune")
	public FortuneTellerImpl getFortuneTellerImpl() {
		fortune = new FortuneTellerImpl();
		return fortune;
	}

	@Bean(name = "student")
	public Student getStudent() {
		Student student = new Student("13131010", "Thunder Bolt", "CSE", getFortuneTellerImpl());
		return student;
	}
}
