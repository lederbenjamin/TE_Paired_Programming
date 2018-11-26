package com.techelevator.ssg.model.calculator;

public class AlienTravelEstimate {
	
	private double planetChoice;
	private double earthAge;
	private double travelMode;
	private final double WALKING = 26280;
	private final double CAR = 876000;
	private final double BULLET_TRAIN = 1752000;
	private final double BOEING_747 = 4993200;
	private final double CONCORDE = 11826000;
	private final double MERCURY = 56974146;
	private final double VENUS = 25724767;
	private final double MARS = 48678219;
	private final double JUPITER = 390674710;
	private final double SATURN = 792248270;
	private final double URANUS = 1692662530;
	private final long NEPTUNE = 2703959960L;




	public AlienTravelEstimate(double planetChoice, double travelMode, double earthAge) {
		this.planetChoice = planetChoice;
		this.travelMode = travelMode;
		this.earthAge = earthAge;
	}
	
	
	
	public double getAlienTravelTime() {
		if(planetChoice == 1)
			return getMercuryTravel();
		else if(planetChoice == 2)
			return getVenusTravel();
		else if(planetChoice == 3)
			return getMarsTravel();
		else if(planetChoice == 4)
			return getJupiterTravel();
		else if(planetChoice == 5)
			return getSaturnTravel();
		else if(planetChoice == 6)
			return getUranusTravel();
		else
			return getNeptuneTravel();
		
	}
	
	public double getAlienTravelAge() {
		if(planetChoice == 1)
			return earthAge + getMercuryTravel();
		else if(planetChoice == 2)
			return earthAge + getVenusTravel();
		else if(planetChoice == 3)
			return earthAge + getMarsTravel();
		else if(planetChoice == 4)
			return earthAge + getJupiterTravel();
		else if(planetChoice == 5)
			return earthAge + getSaturnTravel();
		else if(planetChoice == 6)
			return earthAge + getUranusTravel();
		else
			return earthAge + getNeptuneTravel();
		
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
	
	public String getTravelMode() {
		if(travelMode == 1)
			return "walking";
		else if(travelMode == 2)
			return "car";
		else if(travelMode == 3)
			return "bullet-train";
		else if(travelMode == 4)
			return "the Boeing 747";
		else
			return "the Concorde";
		
	}
	
	
	
	private double getMercuryTravel() {
		if (travelMode == 1)
			return MERCURY / WALKING;
		else if (travelMode == 2)
			return MERCURY / CAR;
		else if (travelMode == 3)
			return MERCURY / BULLET_TRAIN;
		else if (travelMode == 4)
			return MERCURY / BOEING_747;
		else
			return MERCURY / CONCORDE;
	}
	
	private double getVenusTravel() {
		if (travelMode == 1)
			return VENUS / WALKING;
		else if (travelMode == 2)
			return VENUS / CAR;
		else if (travelMode == 3)
			return VENUS / BULLET_TRAIN;
		else if (travelMode == 4)
			return VENUS / BOEING_747;
		else
			return VENUS / CONCORDE;
	}
	
	private double getMarsTravel() {
		if (travelMode == 1)
			return MARS / WALKING;
		else if (travelMode == 2)
			return MARS / CAR;
		else if (travelMode == 3)
			return MARS / BULLET_TRAIN;
		else if (travelMode == 4)
			return MARS / BOEING_747;
		else
			return MARS / CONCORDE;
	}
	
	private double getJupiterTravel() {
		if (travelMode == 1)
			return JUPITER / WALKING;
		else if (travelMode == 2)
			return JUPITER / CAR;
		else if (travelMode == 3)
			return JUPITER / BULLET_TRAIN;
		else if (travelMode == 4)
			return JUPITER / BOEING_747;
		else
			return JUPITER / CONCORDE;
	}
	
	private double getSaturnTravel() {
		if (travelMode == 1)
			return SATURN / WALKING;
		else if (travelMode == 2)
			return SATURN / CAR;
		else if (travelMode == 3)
			return SATURN / BULLET_TRAIN;
		else if (travelMode == 4)
			return SATURN / BOEING_747;
		else
			return SATURN / CONCORDE;
	}
	
	private double getUranusTravel() {
		if (travelMode == 1)
			return URANUS / WALKING;
		else if (travelMode == 2)
			return URANUS / CAR;
		else if (travelMode == 3)
			return URANUS / BULLET_TRAIN;
		else if (travelMode == 4)
			return URANUS / BOEING_747;
		else
			return URANUS / CONCORDE;
	}
	
	private double getNeptuneTravel() {
		if (travelMode == 1)
			return NEPTUNE / WALKING;
		else if (travelMode == 2)
			return NEPTUNE / CAR;
		else if (travelMode == 3)
			return NEPTUNE / BULLET_TRAIN;
		else if (travelMode == 4)
			return NEPTUNE / BOEING_747;
		else
			return NEPTUNE / CONCORDE;
	}
}
