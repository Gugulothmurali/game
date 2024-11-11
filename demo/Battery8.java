package com.smartbattery.demo;

public class Battery8 {
	public static void main(String[] args) {
		
		int signalStrength = 60; // Example signal strength 
		if (signalStrength > 75) { 
		System.out.println("Excellent signal."); 
		} else if (signalStrength >= 50) { 
		System.out.println("Good signal."); 
		} else { 
		System.out.println("Weak signal. Consider moving closer to the router.");
	}
	}

}
