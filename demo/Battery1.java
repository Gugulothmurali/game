package com.smartbattery.demo;

public class Battery1 { 
	
public static void main(String[] args) {
	

	int batteryLevel = 45; // Example battery level 
	if (batteryLevel > 50) { 
	System.out.println("High Performance Mode."); 
	} else if (batteryLevel >= 20) { 
	System.out.println("Balanced Mode."); 
	} else { 
	System.out.println("Power Saving Mode.");
	}
}
}