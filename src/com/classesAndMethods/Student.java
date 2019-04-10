package com.classesAndMethods;

import java.util.Scanner;

public class Student {

	int score;
	// String getGrade;

	public static void main(String[] args) {

		Student obj = new Student();

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your score");

		obj.score = scan.nextInt();

		char result = obj.getGrade(obj.score);

		System.out.println(result);

	}

	char getGrade(int a) {
		
		
		if (a > 90) {

			return 'A';
		}

		else if (a > 80) {

			return 'B';
		}

		else if (a > 70) {

			return 'C';
		}

		else {
			return 'D';
		}

	}

}
