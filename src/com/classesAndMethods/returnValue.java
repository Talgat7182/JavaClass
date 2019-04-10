package com.classesAndMethods;

public class returnValue {

	public static void main(String[] args) {

		String str = "Hello";

		int stringLength = str.length();

		System.out.println(stringLength);

		//char character = str.charAt(3);
		System.out.println(str.charAt(3));

		returnValue obj = new returnValue();
		// return value

		String day = obj.whatIsADay();

		System.out.println("Today is " + day);

		// int num= obj.findLargest(20,15,35);

		int largestNum = obj.findLargest(20, 10);

		System.out.println(largestNum);

		boolean isOdd;

		if (largestNum % 2 == 0) {

			isOdd = false;
		}

		else {
			isOdd = true;
		}

		System.out.println(isOdd);

	}

	String whatIsADay() {

		return "Thursday";
	}

	int findLargest(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}
