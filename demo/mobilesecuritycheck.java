package com.smartbattery.demo;

public class mobilesecuritycheck {

	public static void main(String[] args) {
		boolean passwordSet = true; // Example setting 
		boolean fingerprintSet = false; // Example setting 
		if (passwordSet || fingerprintSet) { 
		System.out.println("Phone is secure."); 
		} else { 
		System.out.println("Please set a security option."); 
		}
	}

}
