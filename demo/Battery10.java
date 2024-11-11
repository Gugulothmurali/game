package com.smartbattery.demo;

public class Battery10 {

	public static void main(String[] args) {
		String timeOfDay = "night"; // Example time 
		if (timeOfDay.equals("daytime")) { 
		System.out.println("Color set to Warm White."); 
		} else if (timeOfDay.equals("evening")) { 
		System.out.println("Color set to Cool Blue."); 
		} else {
			System.out.println("Color set to Night Light.");
			
		}
		}
	}


