package com.smartbattery.demo;

public class Battery7 {

	public static void main(String[] args) {
		boolean doNotDisturb = true; // Example mode 
		boolean hasUnreadMessages = false; // Example messages 
		if (doNotDisturb) { 
		System.out.println("Notifications are muted."); 
		} else if (hasUnreadMessages) { 
		System.out.println("You have new messages!");
		} else { 
			System.out.println("No new notifications.");
		}
	}

}
