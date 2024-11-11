package com.smartbattery.demo;

public class Vehiclesaftycheck {

	public static void main(String[] args) {
		boolean seatBeltsFunctioning = true; // Example condition 
		boolean brakesFunctioning = false; // Example condition 
		if (seatBeltsFunctioning && brakesFunctioning) { 
		System.out.println("Vehicle is safe to drive."); 
		} else { 
		System.out.println("Vehicle needs repairs.");
		}
	}

}
