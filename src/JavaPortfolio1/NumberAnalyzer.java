package JavaPortfolio1;
import java.util.Scanner;
import java.util.Arrays;

public class NumberAnalyzer {

	public static void main(String[] args) {
		Scanner input = new java.util.Scanner(System.in );
		System.out.println("Enter the number of items");
		int n = input.nextInt();
		
		double[] numbers = new double[n];
		double sum = 0;
		
		
		System.out.println("Enter the numbers: ");
		for (int i =0; i<n; i++) {
			numbers[i] = input.nextDouble();
			sum+= numbers[i];
			
		}
		
		//finding average (mean)
		double average = sum / numbers.length;
		
		//finding the maximum value and the minimum value of the array
		int lower = 0;
		int higher = 0;
		for (double element:numbers) {
			if (element < average) {
				lower++;
			}
			else {
				higher++;
			}
		}
		
		double max = numbers[0];
		double min = numbers[0];
		for (double element:numbers) {
			if(element < min) {
				min = element;
			}
			if(element > max) {
				max = element;
			}
			
		}
		System.out.println("Your min is: " + min);
		System.out.println("\nYour max is: " + max);
		
		System.out.println("\nYour mean is :" + average);
		
		//Finding median 
		Arrays.sort(numbers);
		System.out.printf("\nArray in order: %s", Arrays.toString(numbers));
		
		double median;
		if (n % 2 != 0) {
			median = (numbers[n/2]);
		}
		else {
		median = (numbers[(n-1) / 2] + numbers[n/2]) / 2.0;
			
		}
		System.out.println("\nYour median is: " + median);
		
		//finding mode
		double count2 = 0;
		double count1 = 0;
		double popular1 = 0;
		double popular2 = 0;
		for ( int i = 0; i < numbers.length; i ++) {
			popular1 = numbers[i];
			count1 = 0;
			for (int j = i + 1; j < numbers.length; j++) {
				if (popular1 == numbers[j]) count1++;
			}
			if (count1 > count2) {
				popular2 = popular1;
				count2 = count1;
			}
			else if (count1 == count2) {
				popular2 = Math.min(popular2, popular1);
			}
		}
	System.out.println("\nYour mode is " + popular2);
		}
}

