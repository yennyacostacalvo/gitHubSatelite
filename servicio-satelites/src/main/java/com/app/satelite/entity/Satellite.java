package com.app.satelite.entity;

import java.util.ArrayList;
import java.util.List;

public class Satellite extends Ship{
	
	private double distance;

	private String name;

	private List<String> message;	
		

	public Satellite(double d, String name, ArrayList<String> mgss) {
		this.distance = d;
		this.name = name;
		this.message = mgss;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMessage() {
		return message;
	}

	public void setMessage(List<String> message) {
		this.message = message;
	}

	
}
