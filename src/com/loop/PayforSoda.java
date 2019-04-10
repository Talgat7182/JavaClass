package com.loop;
import java.util.Scanner;

public class PayforSoda {
	public static void main(String[] args) {

	// ask user to pay for soda
	//keep asking the user to pay for the soda until the entered amount is not equal to 1.99, 
	//after the user got the right amount, stop asking
		
		double a;
		Scanner input;

		input = new Scanner(System.in);
		System.out.println("Please  pay for soda");
		a = input.nextDouble();

		while (a != 1.99) {

			
			System.out.println("Please pay for the soda");
			a = input.nextDouble();

		}

	System.out.println("Please enjoy soda");
	}
}
