package JavaPortfolio1;
import java.util.Scanner;
/*
 * Caleb Mouritsen
 * 11/1/18
 * Program that takes 5 cities and prints them in alphabetical order
 */

public class AlphabeticalCities {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//initialize variables
		String city1;
		String city2; 
		String city3;
		String city4;
		String city5;
		String temp;
		
		//user prompt city 1
		System.out.println("Enter the first city");
		
		//user input city 1
		city1 = input.nextLine();
		
		//user prompt city 2
		System.out.println("Enter the second city");
				
		//user input city 2
		city2 = input.nextLine();
		
		//user prompt city 3
		System.out.println("Enter the third city");
				
		//user input city 3
		city3 = input.nextLine();
		
		//user prompt city 4
		System.out.println("Enter the fourth city");
		
		//user input city 4
		city4 = input.nextLine();
		
		//user prompt city 5
		System.out.println("Enter the fifth city");
				
		//user input city 5
		city5 = input.nextLine();
		
		//if statements checking how the strings are alphabetical
		if (city1.compareTo(city2)>0) {
			temp = city1;
			city1 = city2;
			city2 = temp;
			
			}
		if (city2.compareTo(city3)>0) {
			temp = city2;
			city2 = city3;
			city3 = temp;
			if (city2.compareTo(city1)<0) {
				temp = city1;
				city1 = city2;
				city2 = temp;
			}
			
			
		}
		if (city3.compareTo(city4)>0) {
			temp = city3;
			city3 = city4;
			city4 = temp;
			if (city2.compareTo(city3)>0) {
				temp = city2;
				city2 = city3;
				city3 = temp;
				if (city2.compareTo(city1)<0) {
					temp = city1;
					city1 = city2;
					city2 = temp;
				}
				
				
			}
			
		}
		if (city4.compareTo(city5)>0) {
			temp = city4;
			city4 = city5;
			city5 = temp;
			if (city3.compareTo(city4)>0) {
				temp = city3;
				city3 = city4;
				city4 = temp;
				if (city2.compareTo(city3)>0) {
					temp = city2;
					city2 = city3;
					city3 = temp;
					if (city2.compareTo(city1)<0) {
						temp = city1;
						city1 = city2;
						city2 = temp;
					}
					
					
				}
				
			}
		}
		
		//displaying the cities in alphabetical order
		System.out.println("Here are the cities in alphabetical order\n");
		System.out.println(city1);
		System.out.println(city2);
		System.out.println(city3);
		System.out.println(city4);
		System.out.println(city5);
		

	}

}
