package com.loop;

public class ForLoopClass {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}

		// for(int i = 1;i%2!=0;i++) { System.out.println(i); }

		int i = 1;
		while (i <= 20) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}

		/*
		 * int a = 20; while(a<=1) { if(a%2==0) { System.out.println(a);} a--; }
		 */
		for (int a = 20; a >= 1; a -= 2) {
			System.out.println(a);
		}

		for (int b = 20; b <= 50; b++) {
			if (b % 2 == 0) {
				System.out.println(b);
			}

		}

		for (int c = 21; c <= 50; c+=2) {
			//if (c % 2 != 0) {
				System.out.println(c);
			}
		}
	}

	


// i+=2; in increment

// 2 way for odd numbers from 20 to 50;
// int i = 21; i<=50; i+=2; output is 23,25,27......
