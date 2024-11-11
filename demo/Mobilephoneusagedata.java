package com.smartbattery.demo;

public class Mobilephoneusagedata {

	public static void main(String[] args) {
		int dataUsed = 8; // Example data used in GB 
		int dataLimit = 10; // Example data limit in GB 
		if (dataUsed > dataLimit) { 
		System.out.println("Data limit exceeded!"); 
		} else { 
		System.out.println("You are within your data limit.");
		}
	}

}
