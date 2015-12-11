package Programs;

import java.util.Scanner;

public class Assignment5Arrays {

	public static double sum(double[] a) {
		double j = 0;
		for (int i = 0; i < a.length; i++) {
			j = a[i] + j;
		}
		return j;
	}

	public static double[] fill(int n, double v) {
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = v;
		}
		return a;
	}

	public static double[] random(int n) {
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = Math.random();
		}
		return a;
	}

	public static double min(double[] a) {
		double b = Double.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < b) {
				b = a[i];
			}
		}
		return b;
	}

	public static double max(double[] a) {
		double b = Double.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > b) {
				b = a[i];
			}
		}
		return b;
	}

	public static double average(double[] a) {
		return sum(a) / a.length;
	}

	public static double variance(double[] a) {
		double var = 0;
		double average = average(a);
		for (int i = 0; i < a.length; i++) {
			var = (a[i] - average) * (a[i] - average) + var;
		}
		return var / a.length;
	}

	public static double stdDev(double[] a) {
		return Math.sqrt(variance(a));
	}

	public static double[] read() {
		System.out.println("Size of Array:");
		Scanner input = new Scanner(System.in);
		int j = input.nextInt();
		double[] a = new double[j];
		System.out.println("Array Values:");
		for (int i = 0; i < j; i++) {
			a[i] = input.nextDouble();
		}
		return a;
	}

	public static void print(double[] a) {
		System.out.print(a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.print(", " + a[i]);
		}
		System.out.println();
	}

	public static void ArrayInfo(double[] a) {
		System.out.println("For Your Array:");
		print(a);
		System.out.println();
		System.out.println("Sum: " + sum(a));
		System.out.println("Min: " + min(a));
		System.out.println("Max: " + max(a));
		System.out.println("Average: " + average(a));
		System.out.println("Variance: " + variance(a));
		System.out.println("Standard Deviation: " + stdDev(a));
	}

	public static void main(String[] args) {
		ArrayInfo(read());
		Scanner input = new Scanner(System.in);
		System.out.println("Size of Array:");
		int j = input.nextInt();
		System.out.println("Value of all Indicies:");
		double k = input.nextDouble();
		ArrayInfo(fill(j,k));
		System.out.println("Size of Random Array:");
		int l = input.nextInt();
		ArrayInfo(random(l));
	}

}
