package com.arrays;


public class LargestANDSmalles {

	public static void main(String[] args) {
		int [] numbers = {-10, 1, 25, 35, -20, 105, -55}; 
		
		int max = numbers[0]; 
		
		for(int i =0; i<numbers.length; i++) { 
		if(numbers[i]>max) { 
			max=numbers[i]; 
		} 
		}
		int smallest = numbers[0]; 
	
		for(int i =0; i<numbers.length; i++) {
			if(numbers[i]<smallest) { 
				//     -55  <  -10
				smallest = numbers[i]; 
			}
		}
		
		
		System.out.println("max is: " +max);
		System.out.println("smallest is " + smallest);
	
}
} 
