package com.arrays;

public class Recap {
public static void main(String[] args) {
	
	// let's create an array and retrieve all values from it; 
	
	String [] names = new String[5]; 
	// we have 5 values; but when it comes to index, it starts count from ZERO; 
	
	names[0]= "Luka"; 
	names[1]="Lucy"; 
	names[2] = "Assel"; 
	names[3] ="Samir";
	names[4] = "Shiva"; 
	
	
	for(int i =0; i<names.length; i++) {
	
		System.out.println(names[i]);
	}
	
	// create an array using array literal 
	
	String [] studentNames = {"Mehmet","Zhenis","Alexander","Sekander","Aigerim"};
	
	for(int i =0; i<studentNames.length;i++) { 
	
		// <= length - 1 is the same as <length 
	
		System.out.println(studentNames[i]);
	}
	
	System.out.println("---for each loop---");
	// for each loop; retrieve values using: advanced for loop; for each loop; for enhanced loop;
	 // data type ( give a new name ) = provide collection or variable of the array declared above 
	
	for(String student:studentNames){ 
		
		System.out.println(student);
	}
	
}
}
