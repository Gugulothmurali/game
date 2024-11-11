package com.smartbattery.demo;

public class Battery4 {
 public static void main(String[] args) {
	 int currentTemperature = 70; // Example temperature 
	 if (currentTemperature < 68) { 
	 System.out.println("Heating Mode."); 
	 } else if (currentTemperature > 78) { 
	 System.out.println("Cooling Mode."); 
	 } else { 
	 System.out.println("Temperature is comfortable."); 
	 }
}
}
