package Programs;

import java.util.Scanner;

public class Assignment2Switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		switch (n % 5) {
		case 0:
			System.out.println("Is divisable by 5");
			break;
		default:
			System.out.println("Isn't divisable by 5");
			break;
		}
	}

}
