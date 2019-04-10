package com.classesAndMethods;

public class Calculator1 {

	int sum(int a, int b, int c) {

		return (a + b + c);
	}

	int average(int a, int b, int c) {

		return (a + b + c) / 3;

	}

	int min(int a, int b, int c) {
// a=1, b=2, c=-10;  min = -10; 
		int min = a;
		if (b < a) {
			min = b;}
		 if (c < min) {
			min = c;
		}
		
		return min;

	}

	int max(int a, int b, int c) {

		int max = a;
		if (b > a) {
			max = b;}
		 if (c > max) {
			max = c;
		}
		
		return max;

	}
}