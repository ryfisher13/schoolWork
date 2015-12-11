package Programs;

import java.util.Scanner;

public class Assignment2Week {

	public static void main(String[] args) {
		int n = 0;
		while (n < 9) {
			System.out.println(n);
			switch (n) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Not a valid day");
				break;

			}
			n++;
		}
	}
}