package com.classesAndMethods;

public class PalindR {

	public static void main(String[] args) {

		PalindR obj = new PalindR();

		String word = obj.printIt("Kazak");
		System.out.println(word);

	}

	String printIt(String a) {
		String reverse = "";
		for (int i = a.length() - 1; i >= 0; i--) {

			reverse += a.charAt(i);
		}
			if (reverse.equalsIgnoreCase(a)) {

				return "palindorme";
			} else {
				return "not palindrome";

			}
		}

	
}
