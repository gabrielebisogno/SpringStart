package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"attenzione",
			"fortuna2.0",
			"chiusafortuna"
	};
	
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
				return data[myRandom.nextInt(data.length)];
	}

}
