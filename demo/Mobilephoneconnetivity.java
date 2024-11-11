package com.smartbattery.demo;

public class Mobilephoneconnetivity {

	public static void main(String[] args) {
		boolean wifiConnected = false; // Example connection status 
		boolean cellularConnected = true; // Example connection status 
		if (wifiConnected || cellularConnected) { 
		System.out.println("Connected to the internet."); 
		} else { 
		System.out.println("No internet connection."); 
		}
	}

}
