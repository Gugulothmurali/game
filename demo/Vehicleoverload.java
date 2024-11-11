package com.smartbattery.demo;

public class Vehicleoverload {

	public static void main(String[] args) {
		int currentWeight = 3000; // Current weight in pounds 
		int weightLimit = 3500; // Weight limit in pounds 
		if (currentWeight > weightLimit) { 
		System.out.println("Overloaded! Reduce weight."); 
		} else { 
		System.out.println("Weight is within limits."); 
		}
	}

}
