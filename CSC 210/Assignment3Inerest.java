package Programs;

import java.util.Scanner;

public class Assignment3Inerest {

	public static void main(String[] args) {
		//gets the principal as an input from the keyboard
		System.out.println("Principal:");
		Scanner p = new Scanner(System.in);
		double principal = p.nextDouble();
		//gets the years of investment as input from the keyboard
		System.out.println("Terms of investment(# of years):");
		Scanner n = new Scanner(System.in);
		int years = n.nextInt();
		//gets the APR as input from the keyboard
		System.out.println("Annual percintage rate(APR):");
		Scanner r = new Scanner(System.in);
		double apr = r.nextDouble() * .01;
		//creates a variable to calculate the earnings
		double earnings;
		//prints the value of the current principal
		System.out.println("Value at the begining of year 0:" + principal);
		//creates a loop that runs counting the number of years
		for (int count = 0; count < years; count++) {
		//calculates the earnings then adds it to the principal to get the principal at the end of the year
			earnings = apr * principal;
			principal = principal + earnings;
		//prints the earnings and the principal at the end of that year and begining of the next
			System.out.println("Earnings during year " + count + ":" + earnings);
			System.out.println("Value at the end of year " + (count) + "/beinging of year " + (count+1) + ":" + principal);
		}
	}

}