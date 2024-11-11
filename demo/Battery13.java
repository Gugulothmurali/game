package com.smartbattery.demo;

public class Battery13 {

	public static void main(String[] args) {
		int internetSpeed = 15; // Example speed in Mbps 
		if (internetSpeed > 25) { 
		System.out.println("Setting to 4K."); 
		} else if (internetSpeed >= 10) { 
		System.out.println("Setting to HD."); 
		} else { 
		System.out.println("Setting to SD.");
		}
	}

}
