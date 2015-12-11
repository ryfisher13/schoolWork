package Programs;

import java.util.Scanner;

public class Assignment3VariableCount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//creates a variable to keep the sum and to maintain the input from the keyboard to check if
//the loop should continue
		int max = input.nextInt();
		int sum = 0;
//creates a variable to count, test the count to see if its less than what was assigned the 
// variable max, assigned through the keyboard, and increments the count by 2 so it is always odd
		for (int count = 1 ; count < max; count += 2) {
//adds the odd numbers
			sum = sum + count;

		}
//prints the sum
		System.out.println(sum);
	}
}
