package com.arrays;

public class Arrays1 {

	public static void main(String args[]) {

		/*
		 * int [] arrays = {45,78,12,67,55};
		 * 
		 * for(int i = 0; i<arrays.length; i++) {
		 * 
		 * System.out.print(arrays[i]);
		 * 
		 * 
		 * }
		 */
		int[] arrays1 = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };

		for (int i = 0; i < arrays1.length; i++) {

			if (i % 2 == 0) {

				System.out.print(arrays1[i] + " ");
			}

		}

		char[] letters = { 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x' };

		for (int i = 0; i < letters.length; i++) {
			// for(int y=1;y<=i;y+=2) {

			System.out.print(letters[i]);
		}

	}

}
