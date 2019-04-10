package com.LoopNested;

public class pattern2 {
	public static void main(String[] args) {

		/*
		 * for (int i = 0; i < 5; i++) { // 0 0 // they are interconnected so we need y
		 * <=i; to output the pattern for (int y = 0; y <=i; y++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		for(int i = 1; i <=4; i++) {
			
			for( int y=4; y>=i; y--) { 
			
			System.out.print(y);
			}
			
			System.out.println();
		}
		///
		 //* *
	//	 * for(int i = 5; i>=1; i--) { for(int y=5; y<=i; y--) { System.out.print("*");
	//	 * } System.out.println(); }
	//	 |
//*/
	}
}