package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
//		TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the beam
		System.out.println(coach);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		// close the context
		context.close();
	}

}
