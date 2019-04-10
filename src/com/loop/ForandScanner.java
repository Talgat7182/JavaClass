package com.loop;
import java.util.Scanner;

public class ForandScanner {
	public static void main(String[] args) {

		int num1, num2;
		int largest = 0;
		Scanner input;
		input = new Scanner(System.in);
		
		for (int i = 0; i<=5; i++) {

			System.out.println("Please enter first number ");
			num1 = input.nextInt();
			
			System.out.println("Please enter second number");
			
			num2 = input.nextInt();
// if nested another way to do it. ( outter ) 
			if (num1 > num2) {
				largest = num1;
			} else if (num2 > num1) {
				largest = num2;
		}else {
			System.out.println(num1 + " is equal to " + num2);
			
		
		}
			

			System.out.println(largest + " is the largest ");
		
		
	
	}
	
}
}