package com.classesAndMethods;

public class ApplicationArray {

	static int minOfValues(int[] x) {

		int min = x[0];

		for (int y : x) {
			if (y < min) {

				min = y;

			}

		}

		return min;

	}

}


/*
 * int my_array[] = {0, 1,2,3,4,5,6,7};
 * 
 * 
 * System.out.println("Printing minimum value");
 * 
 * 
 * 
 * System.out.println(ApplicationArray.minOfValues(my_array));
 * 
 */
