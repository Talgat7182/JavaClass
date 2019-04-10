package com.loop;
import java.util.Scanner;

public class Threetimes {

	public static void main(String[] args) {
		Scanner input;
		String question;
		input = new Scanner(System.in);
		int i = 1;

		while (i <= 3) {
			System.out.println("Enter a question");
			question = input.nextLine();
			System.out.println(question);
			i++;
		}

	}
}
