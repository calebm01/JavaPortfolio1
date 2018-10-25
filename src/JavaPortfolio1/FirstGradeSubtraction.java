package JavaPortfolio1;
import java.util.Scanner;

/*
 * Caleb Mouritsen
 * 10/9/18
 * Randomly Generated Math Problems
 */

public class FirstGradeSubtraction {

	public static void main(String[] args) {
		int x=1;
		
		while(x==1) {
			
		
		// initializing the scanner, variables, and allowing the program to randomly generate integers between 0 and 9
		Scanner input = new Scanner (System.in);
		int num1 = (int)(System.currentTimeMillis() % 10);
		int num2 = (int)(System.currentTimeMillis() /7 % 10);
		int ans;
		int correctans;
		
		
		
		
		
		//Allow the user to input their answer
		
		
		//Initialize what the correct answer will be
		correctans = num1-num2;
		
		//making sure the correct answer can't be negative
				if (num1 < num2) {
					System.out.println("Answer the following: ");
					System.out.println(num2 + " - " + num1);
					correctans = num2 - num1;
					
				
				}
				else {
					//Displaying the math problem that needs to be answered
					System.out.println("Answer the following: ");
					System.out.println(num1 + " - " + num2);
				}
		ans = input.nextInt();
		if (ans == correctans) {
			System.out.println("Correct!");
			
		}
		else {
			System.out.println("Sorry, that's incorrect");
			System.out.println("The correct answer is " + correctans);
		}
		}
	}
}


