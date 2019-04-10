package com.LoopNested;

import java.util.Scanner;

public class HomeTask6 {
	public static void main(String[] args) {

		Scanner scan;
		int year;
		scan = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Please enter a guessed leap year");
			year = scan.nextInt();

			if (year % 4 == 0) {
				System.out.println("This year is a leap year");
				break; 
			} else {
				System.out.println("This is not a leap year");
			}
		}

	}
}// if nested 
// if(year%400==0) { System.out.println("Year is a leap year"); 
//break; 
// else if(year%4==0 && year%100!=0) 
//{ System.out.println("Year is a leap year");
//break; } // else { System.out.println("year is not a leap year");  } 
//}


//if year is divisible by 400 --> leap year
//if year is divisible by 100 --> not a leap year
// if year is divisible by 4 --> a leap year