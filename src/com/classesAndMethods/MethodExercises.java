package com.classesAndMethods;

public class MethodExercises {

	public static void main(String[] args) {

		MethodExercises obj = new MethodExercises();

		obj.numbers(14, 27);
		
		obj.oddOrEven(12);
		
		obj.Palindrome("Kazak"); // argument ---> calling, values we are passing we calling the method; 
	}

	void numbers(int a, int b) { 
		
		if(a>b) {
		
		System.out.println("A is larger than B"); }
		
		else { System.out.println("B is larger than A");}
	
}
	// void is a return type, oddOrEven  - method name 
	void oddOrEven(int a) { 
		
		if(a%2==0) {
			System.out.println("number is even");
		}
		else { System.out.println("number is odd");
	}
	}
	
	void Palindrome(String word) // parameter 
	{
		String reverse="";
		for(int i = word.length() -1; i>=0; i--) {
			
			reverse+=word.charAt(i); }
			
			if(reverse.equalsIgnoreCase(word)) {
				System.out.println("It is a palindrome");
			}
			else { System.out.println("It is not a palindrome");
		}
		
		}
	}
	
	



