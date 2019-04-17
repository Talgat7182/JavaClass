 package com.arrays;

public class ForEachIn2D {
public static void main(String[] args) {
	// create a grocery list: fruits {} veggies {}, dairy{}; 
	//retrieve all the values by using 2 different loops
	
	String [][] fruits = { 
			{"apples","kiwis","oranges","bananas"}, 
			{"spinach","carrots","cabbage","avocados"}, 
			{"milk","ayran", "yoghurt"}
	}; 
	
	
			
	for(String [] healthyfood:fruits) { 
		for(String food: healthyfood) { 
			
			System.out.print(food+ " ");
			
		}
		System.out.println();
		
	}
	System.out.println("----2nd way to do it----");
	
	for(int i = 0; i<fruits.length; i++) { 
		
		for(int j=0; j<fruits[i].length; j++) {
			System.out.print(fruits[i][j]+" ");
		}
		System.out.println();
	}
}
}
