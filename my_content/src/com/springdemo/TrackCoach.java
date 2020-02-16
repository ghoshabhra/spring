package com.springdemo;

import com.springdemo.fortunService.FortuneService;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5km daily";
	}

	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();		
	}
	public TrackCoach() {
		super();
	}

}
