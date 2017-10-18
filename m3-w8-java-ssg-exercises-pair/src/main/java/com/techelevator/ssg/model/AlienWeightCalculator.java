package com.techelevator.ssg.model;

import java.util.HashMap;
import java.util.Map;

public class AlienWeightCalculator {
	private int weight;
	private String planet;
	private Map<String, Double> planetWeight;
	
	public AlienWeightCalculator(int weight, String planet){
		this.weight = weight;
		this.planet = planet;
		
		planetWeight = new HashMap<String, Double>();
		planetWeight.put("Mercury",0.38);
		planetWeight.put("Venus",0.91);
		planetWeight.put("Mars", 0.38);
		planetWeight.put("Jupiter",2.34);
		planetWeight.put("Saturn",1.06);
		planetWeight.put("Uranus",.92);
		planetWeight.put("Neptune",1.19);
	}
	
	public double getPlanetWeight(){
		return weight * planetWeight.get(planet);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}

//	public Map<String, Double> getPlanetWeight() {
//		return planetWeight;
//	}

	public void setPlanetWeight(Map<String, Double> planetWeight) {
		this.planetWeight = planetWeight;
	}
}
