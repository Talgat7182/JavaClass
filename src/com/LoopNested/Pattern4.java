package com.LoopNested;

public class Pattern4 {
	public static void main(String[] args) {

		for (int y = 1; y <= 4; y++) {
			
			for (int x = 1; x <= y; x++) {
				
				System.out.print(x);

			}
			
			System.out.println();
		}
			
		
		for (int j = 1; j <= 5; j++) {

				for (int k = 5; k >= j; k--) {
				
					System.out.print(k);

				}
				
				System.out.println();
			}
		
		
	}
		
}

	


