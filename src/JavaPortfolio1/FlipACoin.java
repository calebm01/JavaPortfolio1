package JavaPortfolio1;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class FlipACoin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//initialize variables 
		
		int result;
		int heads = 0;
		int tails = 1;
		Random randomNum = new Random();
		
		//prompt the user to guess if the coin will land on heads or tails
		out.println("Input 0 if you think the coin will land on heads, input 1 if you think the coin will land on tails");
		int guess = input.nextInt();
		
		// do the coin flip, let the user know what the coin landed on and whether their guess was correct
		
		result = randomNum.nextInt(2);
		if(result == 0) {
			out.println("The coin landed on heads");
			if(guess == result) {
				out.println("you got it correct");
			}
			else {
				out.println("Wrong guess :(");
			}
		}
		else if (result == 1) {
			out.println("The coin landed on tails");
			if(guess == result) {
				out.println("you got it correct");
			}
			else {
				out.println("Wrong guess :(");
			}
		}

	}

}
