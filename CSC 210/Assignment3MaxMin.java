package Programs;

import java.util.Scanner;

public class Assignment3MaxMin {

	public static void main(String[] args) {
		//Receives an input from the keyboard and assigns it to n
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		//assigns the minimum value of a double in java to max so that any number will be bigger than it
		double max = java.lang.Double.MIN_VALUE;
		//assigns the maximum value of a double in java to min so that any number will be smaller than it
		double min = java.lang.Double.MAX_VALUE;
		//checks if the input from the keyboard is 0 if so, the loop ends
		while (n != 0) {
		//checks if the max is smaller than the input, if so the input is assigned to max
			if(max<n){
				max = n;
			}
		//checks if the min is bigger than the input, if so the input is assigned to min
			if(min>n){
				min = n;
			}
		//Receives another input from the keyboard and assigns it back to n
			Scanner inputLoop = new Scanner(System.in);
			n = inputLoop.nextDouble();
		}
		//the minimum and maximum numbers are printed
System.out.println("minimum =" + min);
System.out.println("maximum =" + max);

	}
}
