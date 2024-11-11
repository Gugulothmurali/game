package com.smartbattery.demo;

public class Battery16 {

	public static void main(String[] args) {
		boolean motionDetected = true; // Example motion detection 
		boolean systemArmed = true; // Example system status 
		if (motionDetected && systemArmed) { 
		System.out.println("Alert! Motion detected!"); 
		} else if (!systemArmed) { 
		System.out.println("System is disarmed. No alerts.");
		}
	}

}
