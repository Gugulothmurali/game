package com.smartbattery.demo;

public class Battery20 {

	public static void main(String[] args) {
		int currentHour = 9; // Example hour in 24-hour format 
		if (currentHour >= 8 && currentHour <= 10) { 
		System.out.println("Scheduled for cleaning."); 
		} else { 
		System.out.println("Not scheduled to clean.");
		}
	}

}
