package JavaPortfolio1;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class GuessMyNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random rand = new Random();
		
		//initialize variables
		
		
		int attempts = 0;
		int low = 1;
		int high = 50;
		int number = ThreadLocalRandom.current().nextInt(low,high);
		int number2 = ThreadLocalRandom.current().nextInt(low,high);
		
		while (true) {
			System.out.println("Guessing a random number between 1 and 50");
			System.out.println("Your number is " + number + "\n input if guess should be higher, lower, or if it is correct");
			String user = input.next();
			attempts++;
			
			if (user.equals("lower")) {
				high = number;
				number = ThreadLocalRandom.current().nextInt(low, high);
			}
			else if (user.equals("higher")) {
				low = number;
				number = ThreadLocalRandom.current().nextInt(low, high);
			}
			else if (user.equals("correct")) {
				System.out.println("I got it!");
				System.out.println("I got it correct within " + attempts + " tries");
				break;
			}
			
			else {
				System.out.println("I don't understand, maybe try again?");
			}
			if (attempts == 10) {
				System.out.println("I didn't get it within 10 tries, I lose :(");
				break;
			}
		}
		do { 
			System.out.println("Guess a random number between 1 and 50 that I'm thinking of");
			int guess = input.nextInt();
			if (guess > number) {
				System.out.println("Guess lower");
			}
			else if (guess < number) {
				System.out.println("Guess higher");
			}
			else {
				System.out.println("You got it");
				break;
			}
			
			
		}while(attempts != 10);
		
		for (attempts = 0; attempts < 10; attempts ++) {
			System.out.println("Guess another random number between 1 and 50 that I'm thinking of");
			int guess = input.nextInt();
			if (guess > number2) {
				System.out.println("Guess lower");
			}
			else if (guess < number) {
				System.out.println("Guess higher");
			}
			else {
				System.out.println("You got it");
				break;
			}
		}
		System.out.println("You didn't get it right within ten tries, rerun the program to try agian");
		
	}
	}



