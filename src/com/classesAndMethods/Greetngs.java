package com.classesAndMethods;

public class Greetngs {

	public static void main(String[] args) {

		
		Greetngs obj = new Greetngs();

		obj.salem();
		// how to find the largest number;
		
		
		obj.largest(20,10,45); // calling method FindLargest and passing values ...........
		//obj.largest();
		
		
		obj.salemToInstructor("Asel"); 

	}

	void salem() { // method signature  - Specify the name of our method, preferred way is to write a verb e.g. Drive..
		System.out.println("Salem");// method body
	}
	
	
	void salemToInstructor(String name) // put a data type inside parenthesis; Has parameters ( String name   ); 
	{ 
		
		System.out.println("Salem instructor " + name);
	}
    // Passing parameters ---------> to object 
	
	
	void largest(int a, int b, int c)  {
		/*
		 * int a =10; int b = 20;
		 */
		if(a>b && a>c) { 
			System.out.println("A is larger than B & C"); }
		
		else if(b>a && b>c) {
			System.out.println("B is the largest");
		}
		
		else { 
			System.out.println("C is larger than B & A");
		
		}
		
		
		
		
	}
	

	}
