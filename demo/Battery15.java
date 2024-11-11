package com.smartbattery.demo;

public class Battery15 {

	public static void main(String[] args) {
		int aqi = 160; // Example AQI value 
		if (aqi > 150) { 
		System.out.println("High Performance Mode."); 
		} else if (aqi >= 50) { 
		System.out.println("Auto Mode."); 
		} else { 
		System.out.println("Eco Mode."); 
		}
	}

}
