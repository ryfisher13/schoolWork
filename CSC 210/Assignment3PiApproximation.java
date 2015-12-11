package Programs;

public class Assignment3PiApproximation {

	public static void main(String[] args) {
		//makes a for loop to repeat the nested loop to check different numbers of repetitions 
		for (int j = 10000; j <= 100000; j += 10000) {
			//create the variable Pi and set it to 0 so every time the number of repetitions is increased
			//the start is the same
			double Pi = 0;
			//create a loop to add all of the numbers
			for (int i = 1, l = 0; i <= j; i += 2, l++) {
				//use the Math.pow function to subtract every other number
				Pi = Pi + (Math.pow(-1, l) * (1.0 / i));
			}
			//print the findings, requiring Pi to be multiplied by 4
			System.out.println("Pi approximated using " + j + ":" + (Pi * 4));
		}

	}
}