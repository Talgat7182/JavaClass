package com.classesAndMethods;

public class BankTest {

	public static void main(String[] args) {
		
	
	Bank b = new Bank(); 
	
	BOA boa = new BOA();
	
	PNC pnc = new PNC();
	
	
	int interestRate; 
	
	interestRate=b.chargeInterest(); 
	System.out.println("Bank charges interest="+interestRate);
	
	interestRate=boa.chargeInterest(); 
	System.out.println("BOA charges interest="+interestRate);
	
	
	interestRate=pnc.chargeInterest(); 
	System.out.println("PNC charges interest="+interestRate);
	
	
	}
}
