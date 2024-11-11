package com.smartbattery.demo;

public class Mobilephonebocking {

	public static void main(String[] args) {
		boolean blockUnknown = true; // Example user setting 
		boolean callerUnknown = true; // Example caller status 
		if (blockUnknown && callerUnknown) { 
		System.out.println("Call blocked."); 
		} else { 
		System.out.println("Call allowed.");
		}
	}

}
