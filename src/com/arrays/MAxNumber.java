package com.arrays;

public class MAxNumber {
	public static void main(String[] args) {

		double[] myList = {1.8, 3.9, 6.4, 20.5};

		// Finding the largest element
		double max = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] > max) { 
				max = myList[i]; } 
			
		}
	
		System.out.println("Max is " + max);
	}
}
