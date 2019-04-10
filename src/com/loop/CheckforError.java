package com.loop;

public class CheckforError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;

		do{ 
		 // num++; would be pre increment before the system.out. 7....
		  System.out.print(num + " ");
		  num = num + 2; // post increment which means 5 7...
		}

		while (num < 25);

	}

}
