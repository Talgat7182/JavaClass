package com.myclass3;
import java.util.Scanner; 
public class SwitchCases {
	public static void main(String[] args) {
		
		Scanner scan; 
		String country; 
		
		scan=new Scanner(System.in); 
		System.out.println("Enter your country: ");
		country=scan.nextLine(); 
		
		switch(country) { 
		case "Kazakhstan":country="Kazakh"; 
		break; 
		case "Turkey":country="Turkish";
		break; 
		case "Russia": country="Russian"; 
		break; 
		case "France": country="French";
		break; 
		default:country="I don't know your language";
		}
	   System.out.println(country);
		
		
	}

}
