package com.Manapulation;

public class StringManapulationsMore {

	public static void main(String[] args) {

// charAt() ---> returns a character at specified index

		String str = "Students";

		char character = str.charAt(4);

	    System.out.println(character);
	   // System.out.println(str.charAt(4));

		for (int i = 0; i < str.length(); i++) {

			System.out.print(str.charAt(i) + ",");
			
			
		}
		System.out.println();
    System.out.println("--index---");
		String str1 = "Sunday";
		int index = str1.indexOf("n");
		System.out.println(index);

		String str2="Syntax Technologies";
		
		System.out.println(str2.indexOf("Syntax"));//0
		System.out.println(str2.indexOf("Technologies"));//7
		System.out.println(str2.indexOf(" "));//6
		System.out.println(str2.indexOf("w")); //-1 
		
		
		
		System.out.println("-----substring------");
		// count spaces 
		              
		String str3 ="Today is Sunday Java class";
		String newString = str3.substring(9,15);	
		String newString2 = str3.substring(0,5); 
	
		System.out.println(newString +" " +newString2);
	
	
	System.out.println(str3.substring(0,5)); // Today cause it will go from zero to 4 thatis why wwe put 5
	System.out.println(str3.substring(21)); // class ---> we just need begining of the index 
	System.out.println(str3.substring(9,20));//sunday java
	System.out.println(str3.substring(16,20));//java
	
	
	
	}
}
