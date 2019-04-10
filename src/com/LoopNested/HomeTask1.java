package com.LoopNested;

/*3. Print the following pattern:
1
12
123
1234
12345*/
public class HomeTask1 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			           //   1    1 ( 1st iteration )
			           //   2    2
		 for (int a = 1; a <= 5; a++) {
				
				System.out.print(i);

			}
		 
			System.out.println();
		}
	}

}
