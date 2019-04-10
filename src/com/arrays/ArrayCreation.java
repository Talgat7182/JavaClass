package com.arrays;

public class ArrayCreation { 
	public static void main(String[] args) {
	

	// we declare and initialize an array
	int [] array = {10,20,30,40}; // index starts with 0 1 2 3 ....
	System.out.println(array[2]);
	
	// find the size of the array 
	
	System.out.println(array.length); // 4 ( because 4 values in the [] )
	
	
	// create string of names - 5; 
	// we can access them based on indexes... 
	
	String [] names = { "John", "Mike", "Jane", "Alexaneru", "Olga"}; 
	
	System.out.println("there are " + names.length + " values in my array of my names"); 
	System.out.println(names[2]);
	
	
	//int[] numbers; 
	// numbers = {2,3,4,5}; ---> wrong
	
	// when we are using curly braces, we need to be in the same line; 
	

}
}
