package JavaPortfolio1;
import java.util.Scanner;
import static java.lang.System.out;
/*
 * Caleb Mouritsen,
 * Chloe Spilker,
 * Aaron Arthur
 * 10/11/18
 * Computing personal income tax.
 */

public class PersonalTax {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Initiate variables
		int status; 
		int income;
		int income_change;
		double final_tax = 0;
		
		double tax10;
		double tax15;
		double tax25;
		double tax28;
		double tax33;
		double tax35;
		double tax39;
		
		// Ask user to input filing status and income
		out.print("Enter your filing status. \n(Enter 1 for single.\nEnter 2 for Married Filing Jointly.\nEnter 3 for Married Filing Separately.\nEnter 4 for Head of Household): ");
		status = input.nextInt();
		
		out.print("Enter your income (Don't use special characters): ");
		income = input.nextInt();
		
		
		// Start calculation
		
		// If status is single
		if (status == 1) {
			
			// Income brackets - calculations
			if (income <= 9275) {
				final_tax = income * 0.1;
				
			} else if (income <= 37650) {
				income_change = income - 9275;
				tax10 = 9275 * 0.1;
				tax15 = income_change * 0.15;
				final_tax = tax10 + tax15;
				
			} else if (income <= 91150) {
				income_change = income - 37650;
				
				tax10 = 9275 * 0.1;
				tax15 = (37650 - 9275) * 0.15;
				tax25 = income_change * 0.25;
				final_tax = tax10 + tax15 + tax25;
				
			} else if (income <= 190150) {
				income_change =  income - 91150;
				
				tax10 = 9275 * 0.1;
				tax15 = (37650 - 9275) * 0.15;
				tax25 = (91150 - 37650) * 0.25;
				tax28 = income_change * 0.28;
				final_tax = tax10 + tax15 + tax25 + tax28;
				
			} else if (income <= 413350) {
				income_change =  income - 190150;
				
				tax10 = 9275 * 0.1;
				tax15 = (37650 - 9275) * 0.15;
				tax25 = (91150 - 37650) * 0.25;
				tax28 = (190150 - 91150) * 0.28;
				tax33 = income_change * 0.33;
				final_tax = tax10 + tax15 + tax25 + tax28 + tax33;
				
			} else if (income <= 415050) {
				income_change =  income - 413351;
				
				tax10 = 9275 * 0.1;
				tax15 = (37650 - 9275) * 0.15;
				tax25 = (91150 - 37650) * 0.25;
				tax28 = (190150 - 91150) * 0.28;
				tax33 = (413351 - 190150) * 0.33;
				tax35 = income_change * 0.35;
				final_tax = tax10 + tax15 + tax25 + tax28 + tax33 + tax35;
				
			} else if (income > 415050) {
				income_change =  income - 415050;
				
				tax10 = 9275 * 0.1;
				tax15 = (37650 - 9275) * 0.15;
				tax25 = (91150 - 37650) * 0.25;
				tax28 = (190150 - 91150) * 0.28;
				tax33 = (413351 - 190150) * 0.33;
				tax35 = (415050 - 413351) * 0.35;
				tax39 = income_change * 0.396;
				final_tax = tax10 + tax15 + tax25 + tax28 + tax33 + tax35 + tax39;
			} else {
				out.println("income value is invalid, restart the program");
				
			}
			
		}
		
		// If status is married filing jointly
		else if (status == 2) {
			
			// Income brackets - calculations
			if (income <= 18550) {
				final_tax = income * 0.1;
				
			} else if (income <= 75300) {
				income_change = income - 18550;
				
				tax10 = 18550 * 0.1;
				tax15 = income_change * 0.15;
				final_tax = tax10 + tax15;
				
			} else if (income <= 151900) {
				income_change = income - 75300;
				
				tax10 = 18550 * 0.1;
				tax15 = (75300 - 18550) * 0.15;
				tax25 = income_change * 0.25;
				final_tax = tax10 + tax15 + tax25;
				
			} else if (income <= 231450) {
				income_change =  income - 151900;
				
				tax10 = 18550 * 0.1;
				tax15 = (75300 - 18550) * 0.15;
				tax25 = (151900 - 75300) * 0.25;
				tax28 = income_change * 0.28;
				final_tax = tax10 + tax15 + tax25 + tax28;
				
			} else if (income <= 413350) {
				income_change =  income - 231450;
				
				tax10 = 18550 * 0.1;
				tax15 = (75300 - 18550) * 0.15;
				tax25 = (151900 - 75300) * 0.25;
				tax28 = (231450 - 151900) * 0.28;
				tax33 = income_change * 0.33;
				final_tax = tax10 + tax15 + tax25 + tax28 + tax33;
				
			} else if (income <= 466950) {
				income_change =  income - 413350;
				
				tax10 = 18550 * 0.1;
				tax15 = (75300 - 18550) * 0.15;
				tax25 = (151900 - 75300) * 0.25;
				tax28 = (231450 - 151900) * 0.28;
				tax33 = (413350 - 231450) * 0.33;
				tax35 = income_change * 0.35;
				final_tax = tax10 + tax15 + tax25 + tax28 + tax33 + tax35;
				
			} else if (income > 466950) {
				income_change =  income - 466950;
				
				tax10 = 18550 * 0.1;
				tax15 = (75300 - 18550) * 0.15;
				tax25 = (151900 - 75300) * 0.25;
				tax28 = (231450 - 151900) * 0.28;
				tax33 = (413350 - 231450) * 0.33;
				tax35 = (415050 - 413350) * 0.35;
				tax39 = income_change * 0.396;
				final_tax = tax10 + tax15 + tax25 + tax28 + tax33 + tax35 + tax39;
				
			} else {
				out.println("income value is invalid, restart the program");
				
			}
		
		
		

		}
		
		// If status is married filing separately
		else if (status == 3) {
			
			// Income brackets - calculations
			if (income <= 9275) {
				final_tax = income * 0.1;
				
			} else if (income <= 37650) {
				income_change = income - 9275;
				
				tax10 = 9275 * 0.1;
				tax15 = income_change * 0.15;
				final_tax = tax10 + tax15;
				
			} else if (income <= 75950) {
				income_change = income - 37650;
				
				tax10 = 9275 * 0.1;
				tax15 = (37650 - 9275) * 0.15;
				tax25 = income_change * 0.25;
				final_tax = tax10 + tax15 + tax25;
				
			} else if (income <= 115725) {
				income_change =  income - 75950;
				
				tax10 = 9275 * 0.1;
				tax15 = (37650 - 9275) * 0.15;
				tax25 = (75950 - 37650) * 0.25;
				tax28 = income_change * 0.28;
				final_tax = tax10 + tax15 + tax25 + tax28;
				
			} else if (income <= 206675) {
				income_change =  income - 115725;
				
				tax10 = 9275 * 0.1;
				tax15 = (37650 - 9275) * 0.15;
				tax25 = (75950 - 37650) * 0.25;
				tax28 = (115725 - 75950) * 0.28;
				tax33 = income_change * 0.33;
				final_tax = tax10 + tax15 + tax25 + tax28 + tax33;
			} else if (income <= 233475) {
				income_change =  income - 206675;
				
				tax10 = 9275 * 0.1;
				tax15 = (37650 - 9275) * 0.15;
				tax25 = (75950 - 37650) * 0.25;
				tax28 = (115725 - 75950) * 0.28;
				tax33 = (206675 - 115725) * 0.33;
				tax35 = income_change * 0.35;
				final_tax = tax10 + tax15 + tax25 + tax28 + tax33 + tax35;
				
			} else if (income > 233475) {
				income_change =  income - 233475;
				
				tax10 = 9275 * 0.1;
				tax15 = (37650 - 9275) * 0.15;
				tax25 = (75950 - 37650) * 0.25;
				tax28 = (115725 - 75950) * 0.28;
				tax33 = (206675 - 115725) * 0.33;
				tax35 = (233475 - 206675) * 0.35;
				tax39 = income_change * 0.396;
				final_tax = tax10 + tax15 + tax25 + tax28 + tax33 + tax35 + tax39;
				
			} else {
				out.println("income value is invalid, restart the program");
				
			}
			
			}
		// If status is head of household
		else if (status == 4) {
			
			// Income brackets - calculations
			if (income <= 13250) {
				final_tax = income * 0.1;
				
			} else if (income <= 50400) {
				income_change = income - 13250;
				
				tax10 = 13250 * 0.1;
				tax15 = income_change * 0.15;
				final_tax = tax10 + tax15;
				
			} else if (income <= 130150) {
				income_change = income - 50400;
				
				tax10 = 13250 * 0.1;
				tax15 = (50400 - 13250) * 0.15;
				tax25 = income_change * 0.25;
				final_tax = tax10 + tax15 + tax25;
				
			} else if (income <= 210800) {
				income_change =  income - 130150;
				
				tax10 = 13250 * 0.1;
				tax15 = (50400 - 13250) * 0.15;
				tax25 = (130150 - 50400) * 0.25;
				tax28 = income_change * 0.28;
				final_tax = tax10 + tax15 + tax25 + tax28;
				
			} else if (income <= 413350) {
				income_change =  income - 210800;
				
				tax10 = 13250 * 0.1;
				tax15 = (50400 - 13250) * 0.15;
				tax25 = (130150 - 50400) * 0.25;
				tax28 = (210800 - 130150) * 0.28;
				tax33 = income_change * 0.33;
				final_tax = tax10 + tax15 + tax25 + tax28 + tax33;
				
			} else if (income <= 441000) {
				income_change =  income - 413350;
				
				tax10 = 13250 * 0.1;
				tax15 = (50400 - 13250) * 0.15;
				tax25 = (130150 - 50400) * 0.25;
				tax28 = (210800 - 130150) * 0.28;
				tax33 = (413350 - 210800) * 0.33;
				tax35 = income_change * 0.35;
				final_tax = tax10 + tax15 + tax25 + tax28 + tax33 + tax35;
				
			} else if (income > 441001) {
				income_change =  income - 233475;
				
				tax10 = 13250 * 0.1;
				tax15 = (50400 - 13250) * 0.15;
				tax25 = (130150 - 50400) * 0.25;
				tax28 = (210800 - 130150) * 0.28;
				tax33 = (413350 - 210800) * 0.33;
				tax35 = (441001 - 413350) * 0.35;
				tax39 = income_change * 0.396;
				final_tax = tax10 + tax15 + tax25 + tax28 + tax33 + tax35 + tax39;
				
			} else {
				// if income is invalid
				out.println("Income value is invalid, restart the program");
				
			}
			
		} else {
			// else user enter invalid status
			out.println("Status is invalid, restart the program.");
				
		}
		
		if (final_tax > 0) {
			// prints final tax
			out.println("Your final tax is: $" + final_tax);
		}
	
	}
	
}
	
	

		
		


