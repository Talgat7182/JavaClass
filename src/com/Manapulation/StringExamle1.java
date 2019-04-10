package com.Manapulation;

public class StringExamle1 {
public static void main(String[] args) {
	
	
	
	// we need an integer to count characters
	String str = "Syntax"; 
	int lengthOfString =str.length(); 
	System.out.println(lengthOfString);
	// or just simply 
	System.out.println(str.length());
	
	// we count spaces as well 
	String str1="Syntax Technologies"; 
	int lengthOfString1 =str1.length(); 
	System.out.println(lengthOfString1);
	
	// we can do it this way as well
	String str2="Welcome bro!"; 
	System.out.println(str2.length());
	
	// convert to upper case
	String str3="Hello"; 
	String newString = str3.toUpperCase(); 
	System.out.println(newString);
	
	// convert it to lower case
	String str4="Hello"; 
	String newString1 = str3.toLowerCase(); 
	System.out.println(newString1);
	
	// equals - compares 2 strings, we use boolean type for this, since we check for true or false; 
	// ~~.equals(~~); 
	
	String str5="salem"; 
	String str6 = "Salem"; 
	System.out.println("---Equality----");
	boolean equality = str5.equals(str6); 
	System.out.println(equality);
	
	// Ignore case =  ~~.equalsIgnoreCase(~~); 
	// but not ignoring amount of characters "Chrome" ; "Chromes"; 
	String expectedBrowser ="Chrome"; 
	String actualBrowser ="chrome";
	
	boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser); 
	
	System.out.println(equals);
	
	// we check if it contains it, but it is still case sensitive; 
	// it has morning, but i spelled it Morning Upper case, that's why it doesn't match, so false; 
	
	String str7= "Good morning, students!"; 
	System.out.println("---Contains---");
	boolean contains = str7.contains("Morning"); 
	System.out.println(contains);
	
	// Contains:verification 2way with NEEDEDVALUE 
	
	
	
	String present = "WELCOME, Asel"; 
	String neededValue = "welcome,"; 
	
	boolean verification1 =present.contains(neededValue); // - can i do ignore case here
	System.out.println(verification1);
	
	boolean verification2=present.toLowerCase().contains(neededValue); // - ???
	System.out.println(verification2);
	
	//Starts with or ends with; it is case-sensitive; 
	
	System.out.println("-------StartsWith & EndsWith---------");
	String str8="syntax"; 
	boolean starts = str8.startsWith("s");
	System.out.println(starts);
	System.out.println(str8.endsWith("x"));
	
	// Empty or not; if we put "  " space, it still counts it, so it is not empty; 
	
	System.out.println("-----isEmpty------");
	String str9=""; 
	boolean isEmpty=str9.isEmpty(); 
	System.out.println(isEmpty);
	
	// Concatenating Strings
	
	System.out.println("----StringConcatenation----");
	String str10 = "Hello "; 
	String str11 ="Ali"; 
	System.out.println(str10+str11);
	// 2nd way concatenate 1 string to the end of another; 
	System.out.println(str10.concat(str11));
	
	
	//
	
	//String verification; We can TRIM IT to make it the same; 
	
	System.out.println("----Verification----");
	String expected = "You may qualify for a multi-policy discount!"; 
	String actual = "   You may qualify for a multi-policy discount! "; 
	
	// System.out.println(expected.equals(actual));
	
	// actual --> we are trimming actual that's why we are using actual 
	 actual=actual.trim(); 
	
	 System.out.println(expected.equals(actual));
	
	
	
}
}
