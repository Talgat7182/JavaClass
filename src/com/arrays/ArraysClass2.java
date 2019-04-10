package com.arrays;

public class ArraysClass2 {
	public static void main(String[] args) {

		double[] list1 = { 3.9, 6.7, 13.3 };
		double[] list2 = new double[list1.length];

		for (int i = 0; i < list1.length; i++) {
			list2[i] = list1[i];
		}

	}
}
