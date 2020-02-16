package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of string
	private String[] data = {
			"Beware of the wolf in sheep's skin",
			"Diligence is the mother of good luck",
			"Fortune favors the brave"
	};
	
	//create a random number
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		return data[myRandom.nextInt(data.length)];
	}

}
