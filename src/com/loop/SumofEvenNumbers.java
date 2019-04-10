package com.loop;

public class SumofEvenNumbers {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 2; i< 5; i+=2) {
			// if (i % 2 == 0) {
			// System.out.println(i);

			// System.out.println(i);
			sum = sum + i;// 0 2 4  
		}
		System.out.println(sum);

		
		sum = 0;
	  for (int i = 0; i <= 50; i++) {

		sum += i * 2;
		
		//System.out.println(i);

		}
		
		System.out.println(sum);


	}
	}


