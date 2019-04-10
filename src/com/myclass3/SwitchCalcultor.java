//HomeWork: Using scanner class createcalculator. Allow user to enter 2 numbers andoperator(+,-,*,/). Based on operator provide theresult to user.
package com.myclass3;
import java.util.Scanner; 
public class SwitchCalcultor {
	public static void main(String[] args) {
	
	Scanner input; 
	int a; 
	int b; 
	char operators; 
	int result=0; 
	
	input= new Scanner(System.in); 
	
	System.out.println("Enter your first number");
	a=input.nextInt(); 

	System.out.println("Enter your operator"); 
    operators=input.next().charAt(0); 
	
    System.out.println("Enter your second number");
	b= input.nextInt(); 
	
    
	
	switch(operators) {
    case '+':result=a+b; 
	break; 
	case '-': result=a-b; 
	break; 
	case '*': result= a*b; 
	break; 
	case '/':result=a/b;
	break; 
	case '%':result=a%b; 
	break; 
	
	
	default:System.out.println("Invalid");
	}
    
	System.out.println("the number is "+ result);
	
	
	
	
}
}





// next().chartAt(0)