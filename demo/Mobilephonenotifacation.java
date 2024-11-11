package com.smartbattery.demo;

public class Mobilephonenotifacation {

	public static void main(String[] args) {
		boolean doNotDisturb = false; // Example preference 
		boolean notificationsEnabled = true; // Example preference 
		if (doNotDisturb && notificationsEnabled) { 
		System.out.println("Notifications will not be shown."); 
		} else if (!doNotDisturb) { 
		System.out.println("Notifications are enabled."); 
		} else { 
		System.out.println("Notifications are disabled.");
		}
	}

}
