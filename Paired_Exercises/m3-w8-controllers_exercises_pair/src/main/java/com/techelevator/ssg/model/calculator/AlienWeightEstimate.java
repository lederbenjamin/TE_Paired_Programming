package com.techelevator.ssg.model.calculator;

public class AlienWeightEstimate {

	private double planetChoice;
	private double earthWeight;

	public AlienWeightEstimate(double planetChoice, double earthWeight) {
		this.planetChoice = planetChoice;
		this.earthWeight = earthWeight;
	}
	
	public double getAlienWeightEstimate() {
		if(planetChoice == 1)
			return getMercuryWeight();
		else if(planetChoice == 2)
			return getVenusWeight();
		else if(planetChoice == 3)
			return getMarsWeight();
		else if(planetChoice == 4)
			return getJupiterWeight();
		else if(planetChoice == 5)
			return getSaturnWeight();
		else if(planetChoice == 6)
			return getUranusWeight();
		else
			return getNeptuneWeight();
		
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
	
	
	
	private double getMercuryWeight() {
		double mercuryWeight = earthWeight * 0.37;
		return mercuryWeight;
	}
	
	private double getVenusWeight() {
		double venusWeight = earthWeight * 0.9;
		return venusWeight;
	}
	
	private double getMarsWeight() {
		double marsWeight = earthWeight * 0.38;
		return marsWeight;
	}
	
	private double getJupiterWeight() {
		double jupiterWeight = earthWeight * 2.65;
		return jupiterWeight;
	}
	
	private double getSaturnWeight() {
		double saturnWeight = earthWeight * 1.13;
		return saturnWeight;
	}
	
	private double getUranusWeight() {
		double uranusWeight = earthWeight * 1.09;
		return uranusWeight;
	}
	
	private double getNeptuneWeight() {
		double neptuneWeight = earthWeight * 1.43;
		return neptuneWeight;
	}
}
