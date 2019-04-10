package com.classesAndMethods;

public class Phone {
	
	String brand,Os, quality; 
	int cost; 
	
	public static void main(String[] args) {
		
		Phone hella1 = new Phone(); 
		
		hella1.brand ="Apple"; 
		hella1.quality ="Sucks"; 
		hella1.Os ="Mac Os"; 
		hella1.cost =900; 
		
		hella1.faceTime();
		hella1.recordVideos(); 
		hella1.watchMovies(); 
		
		
		Phone hella2 = new Phone();
		
		hella2.brand ="Motto";
		hella2.quality ="Android";
		hella2.quality ="Better than Apple"; 
		hella2.cost = 250; 
		
		hella2.faceTime();
		hella2.recordVideos(); 
		hella2.watchMovies(); 
		
		
		Phone hella3 = new Phone();
		hella3.brand = "Nokia";
		hella3.quality = " Apple can only dream about it";
		hella3.Os ="Legendary"; 
		hella3.cost = 120; 
		
		hella3.faceTime();
		hella3.recordVideos(); 
		hella3.watchMovies(); 
		
		
		
		
		
	} // close method body; 
	
	
	void faceTime() { System.out.println("Yes you can facetime on your phone "+ " " +brand);
	}
	void recordVideos() {System.out.println("Yes you can record vidoes on your phone" +" " +brand); 
	}
	void watchMovies() { System.out.println("Yes you can watch movies on your phone " +" " +brand);
	}
	
}