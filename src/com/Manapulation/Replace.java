package com.Manapulation;


// REPLACE
public class Replace { public static void main(String[] args) {
	

/// hey go inside my string and replace my all a characters with e; 
	
	
	
	String str ="I am a good tester#1!"; 
	String newStr=str.replace("a","e"); 
	System.out.println(newStr);
	
	// replace good with great 
	String newStr1=str.replace("good",  "phenominal");	
	System.out.println(newStr1); 
	
	// everything is case sensitive, if i spelled what I need to change with upper case and it is lower case,no changes; 
	String newStr2 = str.replace("Tester", "programmer"); 
	
	
	
	System.out.println(newStr2);
	
	// i can reassign like in this example, str was reassigned; 
	
	str = str.replace("!","?");
	System.out.println(str);
	// it was changed above, so we will have ? mark instead of !...
	str=str.replace("1","2"); 
	System.out.println(str);
	
	
	// 2 Replace group of what? numbers = 0 - 9; 
	//
	System.out.println("---------------------------------------");
	String str1 = "12Hello 3232 World 465%^%"; 
	String replacedNoNumbers = str1.replaceAll("[0-9]",""); 
	
	
	System.out.println(replacedNoNumbers);
	
	String replacedNoCharacter = replacedNoNumbers.replaceAll("[A-Za-z]","");
	System.out.println(replacedNoCharacter);
	
	String newString=replacedNoNumbers.replaceAll("[^A-Z a-z]",""); 
	System.out.println(newString);
	// ^ = not Replace everything except abc
	
	// replace all except for numbers
	String str5 = "1Hello123"; 
	
	System.out.println(str5.replaceAll("[^0-9]",""));
	
	
	
}
	
}
