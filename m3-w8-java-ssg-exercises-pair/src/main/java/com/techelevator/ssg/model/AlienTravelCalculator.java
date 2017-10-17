package com.techelevator.ssg.model;

import java.util.HashMap;
import java.util.Map;

public class AlienTravelCalculator {
	private int age;
	private String planet;
	private String modeOfTransportation;
	private Map<String, Long> planetDistance;
	private Map<String, Integer> planetMode;

	public AlienTravelCalculator(int age, String planet, String modeOfTransportation) { 
		this.age= age;
		this.planet= planet;
		this.modeOfTransportation = modeOfTransportation;
		
		planetDistance = new HashMap<String, Long>();
		planetDistance.put("Mercury", 56974146L);
		planetDistance.put("Venus", 25724767L);
		planetDistance.put("Mars", 48678219L);
		planetDistance.put("Jupiter",390674710L);
		planetDistance.put("Saturn",792248270L);
		planetDistance.put("Uranus",1692662530L);
		planetDistance.put("Neptune",2703959960L);	
	
		planetMode = new HashMap<String, Integer>();
		planetMode.put("Walking",3);
		planetMode.put("Car", 100);
		planetMode.put("Bullet Train", 200);
		planetMode.put("Boeing 747",570);
		planetMode.put("Concorde",1350);
		
	
	}
	public double getPlanetMode(){
		return planetDistance.get(planet) / planetMode.get(modeOfTransportation);
	}
	
	public double getAlienAge(){
		return (planetDistance.get(planet) / planetMode.get(modeOfTransportation)) + age; 
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlanet() {
		return planet;
	}
	public void setPlanet(String planet) {
		this.planet = planet;
	}
	public String getModeOfTransportation() {
		return modeOfTransportation;
	}
	public void setModeOfTransportation(String modeOfTransportation) {
		this.modeOfTransportation = modeOfTransportation;
	}
		

}
