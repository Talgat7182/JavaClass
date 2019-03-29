package com.class2;

import java.util.Scanner; 

public class Triangle {
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

	// this is another option to run it. 
	//int width; 
	//int length; 
	//int area;  
	//int perimeter; 
		
		System.out.print("Enter the width of triangle : ");
	  int width = scanner.nextInt();
		
		System.out.print("Enter the length of triangle : ");
	 int length = scanner.nextInt();
	 
	 int area = width*length; 
	 int perimeter = 2*(width + length); 

		System.out.println("The area of triangle is "+ area);
		System.out.println("The perimeter of triangle is "+ perimeter);
		
		
	
}
}
