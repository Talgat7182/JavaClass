package com.classesAndMethods;

public class Carz {

	public String color; // null by default

	// public static int ( if it is static, i am gonna have only one copy; )
	public static int totalCars; // 0 by default 0+1=1+1=2;

	public static void main(String[] args) {

		Carz car1 = new Carz();
		car1.color = "red";

		totalCars++;
		// car1.totalCars++;
		Carz car2 = new Carz();

		car2.color = "navy blue";
		
		//car2.totalCars++;
		totalCars++;

		System.out.println("Total cars we made is " + totalCars);

	}

}
