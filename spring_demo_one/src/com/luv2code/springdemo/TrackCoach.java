package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	

	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		 return "Run a hard 5k"; 
	}

	@Override
	public String getDailyForture() {
		return "Just Do It: " + fortuneService.getForture();
	}
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	public void doMyStartupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyStartupStuffYoYo");
	}
}
