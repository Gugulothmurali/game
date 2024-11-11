package com.smartbattery.demo;

public class Battery12 {

	public static void main(String[] args) {
		int fridgeTemperature = 45; // Example temperature 
		if (fridgeTemperature > 40) { 
		System.out.println("Warning: Temperature too high!"); 
		} else if (fridgeTemperature < 32) { 
		System.out.println("Warning: Temperature too low!"); 
		} else { 
		System.out.println("Temperature is optimal."); 
		}
	}

}
