package com.arrays;

public class CountriesTwoDim {
	public static void main(String[] args) {

		String[][] countries = { { "USA", "Canada", "Mexico" },
				{ "Peru", "Chili", "Guatemala","Bolivia"},
				{ "Belgium", "Finland", "Norway", "Spain","Poland" },
				{ "Kazakhstan", "Singapour", "China", "Korea", "Japan" } };

		for (int row = 0; row < countries.length; row++) {
			for (int col = 0; col < countries[row].length; col++) {
			
				System.out.print(countries[row][col] + " ");

			}

			System.out.println();
		}

	}

}
