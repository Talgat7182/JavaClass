package com.class17;

import com.class17_2.Application;


public class Calculator extends Application {

	public static void main(String[] args) {
		// ScannerMethod scnMthd = new ScannerMethod();

		Application operations = new Application();
		

		int x = 10, y = 100;

		int d = operations.sum(x, y);
		
		
		System.out.println(d);

	}

}