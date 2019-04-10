package com.classesAndMethods;

public class Pattern3 {

	public static void main(String[] args) {

		Pattern3 obj = new Pattern3();

		obj.printNumber();

	}

	void printNumber() {

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= 1; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print(" x");

				}

			}
			System.out.println();
		}

	}

}
