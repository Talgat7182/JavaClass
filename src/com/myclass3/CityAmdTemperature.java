package com.myclass3;

import java.util.Scanner; 
public class CityAmdTemperature {
	public static void main(String[] args) {
		// declaring variable
		// another way
		//String city; 
		//int temp; 
		// temp =scan.nextLine(0); 
		
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Please enter the city");
		// capturing and dumping it in the console 
		String name = scan.nextLine(); 
		
		System.out.println("Enter the temperature in F");
		// taking it input and throwing it in the variable 
		
		int temp=scan.nextInt(); 
		
		// formula to convert from F to C
		
		int convertedTemp=(temp - 32)*5/9; 
		
		// concatenating city name, temp, convertedTemp + formula
		
		System.out.println("the temperature in the city "+name + " is " + convertedTemp + "C"); 
		
		

		
	
	}

}
