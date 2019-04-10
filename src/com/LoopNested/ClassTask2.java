package com.LoopNested;

import java.util.Scanner;

/**
 * . Ask user to enter the item they want to buy and the price for the item.
 * Then ask user to pay for it. Every time user enters money accumulate the
 * amount and tell user how much is left to pay off the amount. Whenever user
 * done with payments tell them "Thank you for shopping!"
 */

public class ClassTask2 {
	public static void main(String[] args) {

		Scanner scan;
		String item;
		int price;
		int payment;
		int balance = 0;
		
		scan = new Scanner(System.in);
		System.out.println("Select the item you want to buy");
		item = scan.nextLine();
		System.out.println("The price of the item is: ");
		price = scan.nextInt();
        boolean morePayment = true; 
        int morePay; 
		do {
			System.out.println("Please enter your payment: ");
			payment = scan.nextInt();
			// i put balance to find out how much i need to pay extra
			// it is when assuming that the price is more than payment..
			if (payment > price) {
				balance = payment - price;
				System.out.println("Here's your change $" + balance);
				break; 
			} else if (payment < price) {
				balance = price - payment;
				System.out.println("Please add more $ " + balance);
				
			if(morePayment)  {
				morePay=scan.nextInt(); 
				price = payment + morePay; 
				System.out.println("You entered $" +price+ " by adding " + 
						"$" + morePay + "." +" Thanks for shopping");
				break; 
			}
			}
			}
		while(payment!=price);

	//System.out.println();

}

}
