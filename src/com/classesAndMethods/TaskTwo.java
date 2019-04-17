package com.classesAndMethods;

public class TaskTwo {
	
	String name; 
	int grades; 
	
	public TaskTwo(String name) { 
		
		System.out.print("My name is "+ name+" and my average is ");
		
	}

	int findAverage(int a, int b, int c) { 
		
		return (a+b+c)/3; 
	}
}
