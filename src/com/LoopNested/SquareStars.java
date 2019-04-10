package com.LoopNested;

public class SquareStars {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int y = 1; y <= 6; y++) {
                    // rows                 columns 
				if (i == 1 || i == 4 || y == 1 || y == 6) {
					System.out.print(y);

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
