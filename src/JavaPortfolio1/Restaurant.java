package JavaPortfolio1;
import java.util.Scanner;
import static java.lang.System.out;
/*
 * Caleb Mouritsen 
 * 9/26/18
 * Restaurant menu with inputs and pricing information.
 */
public class Restaurant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		out.println("Here is the restaurant menu");
		out.println("Sandwich: $3.50");
		out.println("Tuna Sandwich: $10.00");
		out.println("Toast: $23.00");
		out.println("End piece of loaf: $50.00");
		out.println("deluxe meatball sub (with mushrooms): $0.25\n");
		
		double item1;
		double item2;
		double item3;
		double total;
		double tax;
		double tip;
		double total2;
		double total3;
		double tip2;
	
		out.println("What is the cost of one of the items you want to buy?");
		item1 = input.nextDouble();
		out.println("What is the cost of another item you want to buy?");
		item2 = input.nextDouble();
		out.println("What is the cost of the last item you want to buy?");
		item3 = input.nextDouble();
		
		total = item1 + item2 + item3;
		out.printf("your total before tax is  $ %.2f %n", total);
		tax = total * 0.047;
		total2 = total + tax;
		out.printf("your total with tax is  $ %.2f %n", total2);
		out.println("What is the percentage that you want to tip?");
		tip = input.nextDouble() / 100;
		tip2 = total2 * tip;
		total3 = total2 + tip2;
		out.printf("your total with tip is  $ %.2f %n", total3);
		
		
		
		
		

	}

}
