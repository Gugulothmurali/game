package com.smartbattery.demo;

public class Mobilephonecall {

	public static void main(String[] args) {
		boolean networkAvailable = true; // Example network status 
		int batteryPercentage = 30; // Example battery percentage 
		if (networkAvailable && batteryPercentage > 20) { 
		System.out.println("You can make a call."); 
		} else { 
		System.out.println("Cannot make a call. Check network and battery.");
		
		
		}
	}

}
