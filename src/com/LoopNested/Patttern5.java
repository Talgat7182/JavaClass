package com.LoopNested;

public class Patttern5 { public static void main(String[] args) {
	
	
	for(int i = 1; i<=5; i++) {
		
		for( int y=5; y>=i; y--) { 
		
			System.out.print(y);
		}
		 System.out.println();
	}

}
}
