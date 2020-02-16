package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemoApp {

	public static void main(String[] args) {
		//load the spring config file
		System.out.println("0");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive bean from spring container
		System.out.println("1");
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println("2");
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		//close the context
		context.close();
	}

}
