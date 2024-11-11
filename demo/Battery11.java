package com.smartbattery.demo;

public class Battery11 {

	public static void main(String[] args) {
		int eReaderBattery = 10; // Example battery percentage 
		if (eReaderBattery < 15) { 
		System.out.println("Low battery! Consider charging."); 
		} else { 
		System.out.println("Battery level is sufficient for reading.");
		}
	}

}
