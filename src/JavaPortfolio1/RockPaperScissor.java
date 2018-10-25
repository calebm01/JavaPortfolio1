package JavaPortfolio1;
import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;
/*
 * Caleb Mouritsen
 * 10/25/18
 * Program that plays rock paper scissors with the user
 */

public class RockPaperScissor {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random randomnum = new Random();
	
	//initialize variables
	int rock = 0;
	int paper = 1;
	int scissors = 2;
	int userchoice;
	int compchoice;
	
	//set up the computer choosing a random number between 0 and 2 to be able to play rock paper scissors with the user
	compchoice = randomnum.nextInt(3);
	
	//prompt the user to input their choice for rock, paper, or scissors
	out.println("Welcome to rock paper scissors! \nYou'll be playing against the computer, input 0 for rock, 1 for paper, and 2 for scissors");
	userchoice = input.nextInt();
	
	//set up the different scenarios that can happen within the game
	if (compchoice == userchoice) {
		out.println("You got a draw, that's kinda awkward");
	}
	else if (compchoice == paper && userchoice == rock) {
		out.println("The computer chose paper, paper covers rock \n you lose");
	}
	else if (compchoice == rock && userchoice == paper) {
		out.println("The computer chose rock, paper covers rock \n you win");
	}
	else if (compchoice == rock && userchoice == scissors) {
		out.println("The computer chose rock, rock smashes scissors \n you lose");
	}
	else if (compchoice == scissors && userchoice == rock) {
		out.println("The computer chose scissors, rock smashes scissors\n you win");
	}
	else if (compchoice == scissors && userchoice == paper) {
		out.println("The computer chose scissors, scissors cut paper \n you lose");
	}
	else if (compchoice == paper && userchoice == scissors) {
		out.println("The computer chose paper, scissors cut paper \n you win");
	}

	}

}
