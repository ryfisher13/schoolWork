package Programs;

import java.util.Scanner;

public class Assignment4Methods {
	// question 1
	public static double Distance(double x1, double y1, double x2, double y2) {
		double y;
		double x;
		x = x1 - x2;
		y = y1 - y2;
		return Math.sqrt(x * x + y * y);

	}

	// question 2
	public static double RectangularArea(double x1, double y1, double x2, double y2, double x3, double y3, double x4,
			double y4) {
		double base = Distance(x1, y1, x2, y2);
		double hight = Distance(x2, y2, x3, y3);
		// ignores point 4 because it is defined as a rectangle
		return base * hight;
	}

	// question 3
	public static double VolumeCylinder(double r, double h) {
		return Math.PI * r * r * h;
	}

	// question 4
	public static double Earnings(double p, double i) {
		return i * p;
	}

	// question 5
	public static int SmallestSum(int n) {
		int i = 1;
		for (int j = 0; j <= n; i++) {
			j = i + j;
		}
		return i-1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		/*
		 * System.out.println("Principal:"); double p = input.nextDouble();
		 * System.out.println("Number of years:"); int n = input.nextInt();
		 * System.out.println("Interest Rate:"); double r = input.nextDouble();
		 * double x1 = input.nextDouble(); double y1 = input.nextDouble();
		 * double x2 = input.nextDouble(); double y2 = input.nextDouble();
		 * double x3 = input.nextDouble(); double y3 = input.nextDouble();
		 * double x4 = input.nextDouble(); double y4 = input.nextDouble();
		 * System.out.println(RectangularArea(x1, y1, x2, y2, x3, y3, x4, y4));
		 * System.out.println(Distance(x1, y1, x2, y2));
		 * System.out.println(VolumeCylinder(x1,y1)); r = .01 * r;
		 *  for (int i =0; i < n; i++) { 
		 * System.out.println("Investment: " + p);
		 * System.out.println("Year's earnings: " + Earnings(p, r)); p =
		 * Earnings(p, r) + p; System.out.println("Value of Investment:" + p);
		 * 
		 * }
		 */
		System.out.println(SmallestSum(n));
	}

}
