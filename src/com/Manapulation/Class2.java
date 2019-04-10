
package com.Manapulation;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
	
     Scanner input; 
	
	String username; 
	String password; 
	String confirmedpassword; 
	int needed = 8; 
	
	
	input = new Scanner(System.in); 
	
	System.out.println("Create your username: ");
	username = input.nextLine(); 
	
	System.out.println("Create your password: ");
	password = input.nextLine(); 
	
	System.out.println("Confirm your password: ");
	confirmedpassword = input.nextLine(); 
	
	if(!(username.isEmpty() && password.isEmpty())) { 
		
		
		
		int lengthOfPassword =password.length(); 
		
	   if(lengthOfPassword<needed) {
		   
		   System.out.println("Password is too short");
		
	   } 
	   
	   
	   
	   else if(password.contains(username)) { 
		   
		   System.out.println("Password can not contain username");} 
	   
	   else if(!confirmedpassword.equals(password)) { 
		   System.out.println("Confirmed password should match your pasword");
		   
		   
	   }
	   System.out.println("Your password and username has been created");  
	   
	}
	
	
	
	
	if(password.isEmpty()) {
		System.out.println("Your password line  is empty"); 
		}
	else { System.out.println("Your username line is empty");}
	
		
	
}
} 


