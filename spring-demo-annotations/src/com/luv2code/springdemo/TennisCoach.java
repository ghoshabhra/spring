/**
 * 
 */
package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author abhra.ghosh
 *
 */

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach: Inside default constructor");
	}

//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("inside");
//		this.fortuneService = fortuneService;
//	}
	



	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("inside doMyStartupStuff()");
	}
	
	@PreDestroy
	public void doMyCloseUpStuff() {
		System.out.println("inside doMyCloseUpStuff()");
	}

}
