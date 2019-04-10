package com.loop;

public class ForLoop {
	public static void main(String[] args) {

		// initializing; // condition; // increment ; // from 0 to 10

		for (int i = 0; i <= 10; i++) {

			System.out.println("Good morning" + i);
		}

		// from 10 to 1

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		// incrementing 2 to variable
		for (int a = 0; a <= 20; a += 2) {
			System.out.println(a);
			
			// 0,2,4,6,8.........
			// if the condition is false, it is not gonna run the loop.
		}
	}

}
