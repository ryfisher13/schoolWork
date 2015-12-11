package Programs;

import java.util.Scanner;

public class Assignment2IfThenElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n % 5 == 0) {
			System.out.println("Is divisable by 5");
		} else {
			System.out.println("Isn't divisable by 5");
		}
	}
}
