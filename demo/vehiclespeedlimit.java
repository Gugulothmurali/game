package com.smartbattery.demo;

public class vehiclespeedlimit {

	public static void main(String[] args) {
		int currentSpeed = 65; // Current speed in mph 
		int speedLimit = 60; // Speed limit in mph 
		if (currentSpeed > speedLimit) { 
		System.out.println("Warning: You are exceeding the speed limit!"); 
		} else if (currentSpeed == speedLimit) { 
		System.out.println("You are at the speed limit."); 
		} else { 
		System.out.println("You are under the speed limit.");
		}
	}

}
