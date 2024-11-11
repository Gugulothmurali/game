package com.smartbattery.demo;

public class Mobiletimemanagement {

	public static void main(String[] args) {
		int screenTime = 5; // Example screen time in hours 
		int screenTimeLimit = 4; // Daily limit in hours 
		if (screenTime > screenTimeLimit) { 
		System.out.println("You have exceeded your screen time limit!"); 
		} else { 
		System.out.println("You are within your screen time limit.");
		}
	}

}
