package com.smartbattery.demo;

public class Vehicletirepressure {
	public static void main(String[] args) {
		int tirePressure = 30; // Example pressure in psi 
		int recommendedPressure = 32; // Recommended pressure 
		if (tirePressure < recommendedPressure) { 
		System.out.println("Tire pressure is low! Inflate the tires."); 
		} else { 
		System.out.println("Tire pressure is adequate."); 
		}
	}
	

}
