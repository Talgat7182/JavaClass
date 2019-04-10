package com.arrays;

public class InternationalCars {
	public static void main(String[] args) {
		
		String [][] cars = { 
				{"Ford","Chevrolet","Lincoln","Escalade","Jeep","Mustang","Buik"}, //0
				{"Mercedez","BMW","Porshe","Audi"},       //1
				{"Kia"} ,                                //2
				{"Lamborgini","Ferrari","Fiat"},        //3
				 }; 
	
		for(int row =0; row< cars.length; row++) {
		
			for( int col=0; col<cars[row].length;col++) {
				
				System.out.print(cars[row][col] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("--------------------------");
		for(String[] carz : cars) { 
			for(String brands: carz) { 
				
				System.out.println(brands+ " ");
			}
		}
		
		
	}

}
