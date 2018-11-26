package com.techelevator.ssg.model.calculator;


public class AlienAgeEstimate {
	
	private double planetChoice;
	private double earthAge;
	double earthAgeInDays;


	public AlienAgeEstimate(double planetChoice, double earthAge) {
		this.planetChoice = planetChoice;
		this.earthAge = earthAge;
		this.earthAgeInDays = earthAge * 365.26;
	}
	
	public double getAlienAgeEstimate() {
		if(planetChoice == 1)
			return getMercuryAge();
		else if(planetChoice == 2)
			return getVenusAge();
		else if(planetChoice == 3)
			return getMarsAge();
		else if(planetChoice == 4)
			return getJupiterAge();
		else if(planetChoice == 5)
			return getSaturnAge();
		else if(planetChoice == 6)
			return getUranusAge();
		else
			return getNeptuneAge();
		
	}
	
	public String getPlanetName() {
		if(planetChoice == 1)
			return "Mercury";
		else if(planetChoice == 2)
			return "Venus";
		else if(planetChoice == 3)
			return "Mars";
		else if(planetChoice == 4)
			return "Jupiter";
		else if(planetChoice == 5)
			return "Saturn";
		else if(planetChoice == 6)
			return "Uranus";
		else
			return "Neptune";
		
	}
	
	
	
	private double getMercuryAge() {
		double mercuryAge = earthAgeInDays * 4.152;
		return mercuryAge;
	}
	
	private double getVenusAge() {
		double venusAge = earthAgeInDays * 1.6255;
		return venusAge;
	}
	
	private double getMarsAge() {
		double marsAge = earthAgeInDays * 0.532;
		return marsAge;
	}
	
	private double getJupiterAge() {
		double jupiterAge = earthAgeInDays * 0.084;
		return jupiterAge;
	}
	
	private double getSaturnAge() {
		double saturnAge = earthAgeInDays * 0.034;
		return saturnAge;
	}
	
	private double getUranusAge() {
		double uranusAge = earthAgeInDays * 0.012;
		return uranusAge;
	}
	
	private double getNeptuneAge() {
		double neptuneAge = earthAgeInDays * 0.006;
		return neptuneAge;
	}
	

}