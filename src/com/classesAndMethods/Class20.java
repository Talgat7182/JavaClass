package com.classesAndMethods;

public class Class20 {

	public static void main(String[] args) {
    
		Class20 obj = new Class20();

		String n = obj.name("talgat");

		String l = obj.lastName("makabayev");

		String e = obj.emailAddress("@gmail.com");
		System.out.println(n + l + e);

	}

	String name(String a) {

		return a;
	}

	String lastName(String b) {

		return b;
	}

	String emailAddress(String c) {
		return c;
	}
}

// return type method
// String createEmail(String name,String lastName, String emailType) { 
//String email = name+lastName +"@"+emailType+".com"; 
//return email.toLowerCase(); 


// Task.obj = new Task(); 
// String email = obj.createEmail("John","Snow","gmail"); 
// SOP(email); 

// email = obj.createEmail("Bob","Snow","outlook");  Reassigned 
//SOP(email); 



