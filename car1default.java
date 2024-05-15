package com.oop1.constructor;

public class car1default {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public car1default() {
		doors = "closed";
		engine = "on";
		driver= "seated";
		speed = 10;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}
		else{
			return "car is not running";
		}
	}

}
