package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getForture() {
		return "Today is your lucky day!";
	}
}
