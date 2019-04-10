package com.classesAndMethods;

public class ReverseClass {
	
	public static void main(String[] args) {
		
	
	ReverseClass obj = new ReverseClass();
	
	String name = obj.reverseIt("Syntax"); 
	System.out.println(name);

}
	
	String reverseIt(String word) {
		
		String reverse="";
		for(int i = word.length()-1; i>=0; i--) {
			
			reverse+=word.charAt(i); 
			
		}
		
		return reverse; 
		
	}
}