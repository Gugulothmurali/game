package com.smartbattery.demo;

public class Mobilebatterystatus {

	public static void main(String[] args) {
		int batteryPercentage = 15; // Example battery percentage 
		boolean isCharging = false; // Example charging status 
		if (batteryPercentage < 20 || isCharging) { 
		System.out.println("Battery low! Please charge your phone."); 
		} else { 
		System.out.println("Battery level is sufficient."); 
		} 
		
	}

}
