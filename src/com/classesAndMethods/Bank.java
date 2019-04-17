package com.classesAndMethods;

// parent class
public class Bank {

	public int chargeInterest() { // overriden
		return 0;

	}
}

	// child class
	class BOA extends Bank {
      @Override // annotation --> you must override to pass it
		public int chargeInterest() {
			return 2;
		}
	}

		// child class
		
	class PNC extends Bank {
			public int chargeInterest() {

				return 3;
			}
	}
			
		

	


