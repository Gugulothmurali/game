package com.smartbattery.demo;

public class Vehicleparking {

	public static void main(String[] args) {
		int currentHour = 14; // Example current hour 
		String dayOfWeek = "Saturday"; // Example day 
		if ((currentHour >= 9 && currentHour <= 17) && 
		(dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday"))) { 
		System.out.println("Parking is allowed."); 
		} else { 
		System.out.println("Parking is not allowed.");
		}
	}

}
