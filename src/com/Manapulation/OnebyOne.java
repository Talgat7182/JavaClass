package com.Manapulation;

public class OnebyOne { public static void main(String[] args) {
	

	String str = "Saturday"; 
	char [] array = str.toCharArray();
	
	for(int i=0; i<array.length; i++) { 
	

		System.out.print(array[i]);
	}
	
	System.out.println();
	
	for(char c:array) { 
		
		System.out.print(c);}


//	for(int i = 0; i<str.length(); i++) {
//	
//		System.out.print(str[i]);
	
	System.out.println();
	
	String original  = "Today is Java Class"; 
	String reverse = ""; 
	
	char [] array1 = original.toCharArray(); 
	
	for(int i = array1.length-1; i>=0; i--) { 
		
		reverse = reverse +array1[i]; 
		
	}
	System.out.print("reversed string is " + reverse);
	
	
	System.out.println();
	
	String reverse1 = ""; 
	
	
	for(int y = original.length()-1; y>=0; y--) { 
		
	
		reverse1= reverse1 +original.charAt(y); 
		System.out.println(reverse1);
		
			
		
	}
	
    String str3 ="Today is Sunday Java class";
	
    String newString = str3.substring(9);	

	System.out.println(newString);


	System.out.println("-------------------------------------------------------------");
    String reversed3 ="";
    String original1  = "Today is Java Class"; 

	System.out.println(original1.length());
 
  
    
    for(int i =original1.length(); i>0; i--) { 
    	
    	reversed3=reversed3+ original1.substring(i-1, i); 
    	//19 -1 =18 
    	//1-1=0
    

        System.out.println(reversed3);
    
    }
    
    
    int a = 19; 
    
    for(int i = a; i>0; i--) {
    	
    	System.out.println(i);
    }
}
}


