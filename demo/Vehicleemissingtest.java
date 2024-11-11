package com.smartbattery.demo;

public class Vehicleemissingtest {

	public static void main(String[] args) {
		int emissionLevel = 120; // Example emission level 
		int emissionLimit = 100; // Example emission limit 
		if (emissionLevel <= emissionLimit) { 
		System.out.println("Vehicle passes emission test."); 
		} else { 
		System.out.println("Vehicle fails emission test.");
		}
	}

}
