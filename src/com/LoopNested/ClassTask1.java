package com.LoopNested;

import java.util.Scanner;

public class ClassTask1 {
	public static void main(String[] args) {
		/*
		 * 1. Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */
		Scanner input;
		int sumofEven = 0;
		int sumofOdd = 0;
		input = new Scanner(System.in);
		System.out.println("Please enter a starting number");
		int startNumber = input.nextInt();
		System.out.println("Please enter a ending number");
		int endingNumber = input.nextInt();

		if (startNumber < endingNumber) {
			for (int i = startNumber; i <= endingNumber; i++) {
				System.out.println(i);
// inside my for loop condition {......}
				if (i % 2 == 0) {
					sumofEven += i;
				} else if (i % 2 != 0) {
					sumofOdd += i;

				}
			}
// inside my outer if condition
			System.out.println("Sum of even numbers is: " + sumofEven);
			System.out.println("Sum of odd numbers is: " + sumofOdd);
		}
	}
}
