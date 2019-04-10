package com.arrays;
import java.util.Scanner;
public class Practice2 {
 
	public static void main(String[] args) {

	   Scanner input = new Scanner(System.in); 
		
		String capital = "";


		String[] countries = { "Kazakhstan", "USA", "Spain", "Russia", "Denmark" };

	
		for (int i = 0; i < countries.length; i++) {

			// countries[i].equals("USA")) { System.out.println("Washington"); 
			if (i==0) {
				capital = "Astana";
			} else if (i == 1) {
				capital = "Washington";
			} else if (i == 2) {
				capital = "Madrid";
			} else if (i == 3) {
				capital = "Moscow";
			} else {
				capital = " Copenhagen";
			}
		
		
		System.out.println(countries[i]);
		System.out.println("your country is " + countries[i] +" and your capital is " +capital);
	}

		
		// we can also do it in switch
		
		String[] countries1 = { "Kazakhstan", "USA", "Spain", "Russia", "Denmark" };
		
		for(String country:countries1) 
		{ 
			switch(country) { 
			case "Kazakhstan": System.out.println("Astana");
			break; 
			case "USA": System.out.println("Washington");
			break; 
			case "Spain":System.out.println("Madrid");
			break; 
			case "Russia":System.out.println("Moscow");
			break; 
			case"Denmark" : System.out.println("Copenhage");
			break; 
			
			default: System.out.println("I don't know what your country is");
			
		
			}
			
		}
}
}
