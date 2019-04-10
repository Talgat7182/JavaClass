package com.loop;

public class OddNumbersLoop {
	public static void main(String[] args) {

		int num = 1;

		while (num <= 13) {

			if (num % 2 != 0) {

				System.out.println(num);

			}

			num++;
		}

		/*
		 * for(int i =1; i<=13; i+=2) {System.out.println(i); }
		 */
	}
}