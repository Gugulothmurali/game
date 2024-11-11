package com.smartbattery.demo;

public class Battery5 {

	public static void main(String[] args) {
		String lightingCondition = "dark"; // Example condition 
		if (lightingCondition.equals("bright")) { 
		System.out.println("Daylight mode."); 
		} else if (lightingCondition.equals("cloudy")) { 
		System.out.println("Cloudy mode."); 
		} else { 
		System.out.println("Night Mode."); 
		} 
	}

}
