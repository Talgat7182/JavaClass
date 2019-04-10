package com.LoopNested;

public class Pattern1 {
	public static void main(String[] args) {

		/*
		 * for (int a = 4; a >= 1; a--) { for (int b = 5; b >= 1; b--) {
		 * System.out.print(b); } System.out.println(); }
		 * 
		 * for (int i = 5; i >= 1; i--) { for (int b = 5; b >= 1; b--) {
		 * System.out.print(i); }
		 * 
		 * System.out.println(); }
		 */
	//	int b=7; 
		for (int i = 1; i <= 4; i++) {
			for (int a = i; a <= 4; a++) {

				// System.out.println(i);
				System.out.print(i);
			}

			System.out.println();
		}

		/*
		 * 
		 * for(int a = 0; a<4; a++) {
		 * 
		 * for (int b=0;b<=a; b++) {
		 * 
		 * System.out.print("*"); }
		 * 
		 * System.out.println(); }
		 * 
		 */

		/*
		 * for(int i=1; i<=4;i++) { // 1st iteration: 4 1 // 3 2 for(int y=4;y>=i; i--)
		 * System.out.println("*"); } System.out.println();
		 */
	}

}
