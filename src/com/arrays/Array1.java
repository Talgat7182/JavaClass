package com.arrays;

public class Array1 {
	public static void main(String[] args) {

		int[] array1; // declare an array
		int[] array2;
		int array3[];

		array1 = new int[4];// creating an array; initializing. Specifying the SIZE...
		// creating an array; initializing
		
		array1[0] = 10; // assigning value
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
	
		// access values
		System.out.println(array1[3]);

	}
}

// if we didn't assign value to an index inside the size, it will assign 0 to the index, as long as it is within theSIZE
