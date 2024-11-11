package com.smartbattery.demo;

public class Mobilephonestorage {

	public static void main(String[] args) {
		int mileage = 15000; // Example mileage 
		if (mileage >= 15000 && mileage < 30000) { 
		System.out.println("Time for an oil change."); 
		} else if (mileage >= 30000) { 
		System.out.println("Maintenance required!"); 
		} else { 
		System.out.println("No maintenance needed yet."); 
		} 
		
	}

}
