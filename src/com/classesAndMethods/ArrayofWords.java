package com.classesAndMethods;

public class ArrayofWords {

	String arr;

	public static void main(String[] args) {

		ArrayofWords obj = new ArrayofWords();

		String[] array = obj.getWordsFromString(" Have a good night students");

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}

		// for(String word:array)
		// SOP(word);
// we need to use split to print words one by one.... 
	}

	private String[] getWordsFromString(String str) {
		String[] words = str.split(" ");

		return words;
	}
}