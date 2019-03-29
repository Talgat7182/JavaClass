package com.class2;

public class BasicCalculator {
	public static void main(String[] args) {
		double kiwis = 45.4; 
		double wine = 23.5; 
		
		double add = kiwis+wine; 
		double sub = kiwis-wine; 
		double mult = kiwis*wine; 
		double div = kiwis/wine; 
		
		System.out.println("the sum of two numbers is " + add+".");
		
		double i =3.9;
		
		double square = i*i; 
		
		System.out.println("the square of i is "+ square+".");
		
		double width = 5; 
		double height = 8; 
		
		double perimeter= 2*(width + height);
		double area= width*height;
		System.out.println("the perimeter of a rectangle with "+ "width " + width +" and "+"height " + height+ " is equal to " + perimeter+" and the area is "+area+".");
	

	
		
		
	}

}
