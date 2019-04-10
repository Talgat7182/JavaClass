package com.Manapulation;

import java.util.Scanner;

public class ReviewInterviewExercies {

	public static void main(String[] args) {

		System.out.println("-----Swapping----------");

		int a = 10;
		int b = 20;

		a = a + b; // 30
		b = a - b; // 10
		a = a - b; // 20

		System.out.println("swapped a is:" + a + "\r\n" + "swapped b is :" + b);

		String sentence = "Syntax Technologies Students";
		String reverse = "";

		for (int i = sentence.length() - 1; i >= 0; i--) {

			reverse += sentence.charAt(i);
			// System.out.print(sentence.charAt(i));
		}
		// System.out.println();

		System.out.println(reverse);

		System.out.println(reverse.length());

		String[] words = reverse.split(" ");

		System.out.println(words.length);

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");

		}

		System.out.println("-------Palindrome or not------");

		Scanner input = new Scanner(System.in);
		String backwards = "";
		String word;
		System.out.println("Please enter any word");
		word = input.nextLine();

		char[] arr = word.toCharArray();

		System.out.println(arr.length);

		for (int i = arr.length - 1; i >= 0; i--) {

			backwards += arr[i]; // word = Qazaq // reversed = q a z a Q
		}
		System.out.println(backwards);

		if (word.equalsIgnoreCase(backwards)) {
			System.out.println("it is a palindrome");
		} else {
			System.out.println("it is not a palindrome");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String check = sc.nextLine();
		String back = "";
		for (int i = check.length() - 1; i >= 0; i--) {
			back += check.charAt(i);
		}

		if (back.equalsIgnoreCase(check)) {

			System.out.println("it is a palindrome");
		} else {
			System.out.println(" it is not");
		}

		Scanner put = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = put.nextInt();
		//String result = "";
		boolean Isprime = true; 
		// 2345 6
 
		for (int j = 2; j < num; j++) {

			if (num %j==0) { 

		      Isprime=false; 
			break; 
			}
		}
		
		if(Isprime) {
			System.out.println(num + " is a prime number");
		}
			
		else { System.out.println(num + " is not a prime number");
	}
 // fibonacci series 
		
		
		int y = 1; 
		int x = 0; 
		int j = 0; 
		
		for(int i =0; i<10; i++) {
			j = y+x; 
			y = x; 
			x = j; 
			
			System.out.println(y);
		}
}
}
