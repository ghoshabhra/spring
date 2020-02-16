package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
//		TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);
		Coach coach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the beam
		System.out.println(coach);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		// close the context
		context.close();
	}

}
