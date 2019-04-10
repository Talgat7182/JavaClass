package com.Manapulation;

public class SecondLargest {
	public static void main(String[] args) {

		int[] arr = { 70000, 5000,
				1000, 2, 3, 106, 303, 56, 89, 4000, 0 };

		int n = arr.length; 
		int largest = Integer.MIN_VALUE; 
	    int secondLargest =Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {

			if (arr[i] > largest) {
				secondLargest= largest;
				largest = arr[i];
			} 

			if (arr[i] < largest && arr[i] > secondLargest) {

				secondLargest = arr[i];
			}

		}

		// System.out.println("largest number is:" +largest);
		System.out.println("second largest is:" + secondLargest);

	}

}
