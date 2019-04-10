// first break it down into temp <=>;
//then true or false  for weather conditions; 
//then acitiviies 
// you can put just variables in conditions, without system.out....


package com.myclass3;

import java.util.Scanner;

public class TaskWeather {
	public static void main(String[] args) {

		Scanner input;
		int temp;
		String activity;
		//String activity =""; null; 

		// first we check the temperature...

		input = new Scanner(System.in);

		System.out.println("Enter the temperature");
		temp = input.nextInt();

		if (temp >= 40 && temp <= 80) {
			System.out.println("Is it raining?");
			boolean raining = input.nextBoolean();
			if (raining) {
				activity = "stay home";
			}
			// System.out.println("stay home");

			else {
				activity = "go hiking";
			}
			// System.out.println("go hiking");
		} else if (temp >= 25 && temp < 40) {
			System.out.println("Is it snowing today?");
			boolean snowing = input.nextBoolean();

			if (snowing) {
				activity = "Go snowboarding";
			}
			// System.out.println("Go snowboarding");

			else {
				activity = "do coding";
			}
		}

		else if (temp > 80 && temp <90) {
			System.out.println("Is it sunny?");
			boolean sunny = input.nextBoolean();
			if (sunny) {
				activity = " go to the beach";
			} else {
				activity = "more coding";
			}
		}

		else { //System.out.println("Please enter valid temperature");  
			
		 activity= "Unknown";
		}

		System.out.println("my activity for today is "+activity);
		//("my activity for today" +activity)
	}
}
