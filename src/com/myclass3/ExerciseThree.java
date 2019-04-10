package com.myclass3;
import java.util.Scanner; 
public class ExerciseThree {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); 
	String cityName; 
		int temp; 
		System.out.println(" Please enter the city name: ");
		
	cityName=scan.nextLine(); 
	
	System.out.println(" Please enter the temperature: ");
	temp=scan.nextInt(); 
	

	int convertedTemp=(temp - 32)*5/9; 
	
	// concatenating city name, temp, convertedTemp + formula
	
	System.out.println("the temperature in the city "+cityName + " is " + convertedTemp + "C"); 
	
	
	}

}
