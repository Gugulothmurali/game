package com.smartbattery.demo;

public class Mobilepohnebackup {

	public static void main(String[] args) {
		int dataUsedSinceLastBackup = 5; // Example data in GB 
		int backupThreshold = 3; // Example threshold in GB 
		boolean backupDoneToday = false; // Example status 
		if (dataUsedSinceLastBackup > backupThreshold && 
		!backupDoneToday) { 
		System.out.println("Backup needed!"); 
		} else { 
		System.out.println("No backup needed."); 
		} 
		
	}

}
