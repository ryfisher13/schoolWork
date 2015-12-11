package Programs;

import java.util.Scanner;

public class Assignment6Sorting {
	public static boolean isSorted(double[] a) {
		boolean b = true;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] > a[i]) {
				b = false;
			}
		}
		return b;
	}

	public static double[] random(int n) {
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = Math.random();
		}
		return a;
	}

	public static void swap(double[] a, int i, int j, int[] b) {
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		b[0]++;
	}

	public static int findMinPos(double[] a, int start, int[] b) {
		int minPos = start;
		for (int i = start + 1; i < a.length; i++) {
			if (a[i] < a[minPos])
				minPos = i;
			b[0]++;
		}

		return minPos;
	}

	public static void selection(double[] a, int[] b) {
		for (int i = 0; i < a.length - 1; i++) {
			int minPos = findMinPos(a, i, b);
			swap(a, i, minPos, b);
		}
	}

	public static void insertion(double[] a, int[] b) {
		for (int i = 1; i < a.length; i++) {
			int j = i;
			while (j != 0 && a[j] < a[j - 1]) {
				swap(a, j, j - 1, b);
				j--;
				b[0]++;
			}
			if (j != 0 && a[j] > a[j - 1]) {
				b[0]++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] b = { 0 };
		int[] c = { 0 };
		double advsls = 0;
		double advins = 0;

		double[][] slctn = new double[100][n];
		double[][] insertion = new double[100][n];
		for (int i = 0; i < 100; i++) {
			slctn[i] = random(n);
			insertion[i] = random(n);
		}
		for (int i = 0; i < 100; i++) {

			selection(slctn[i], b);
			if (isSorted(slctn[i]) == false) {
				System.exit(0);
			}
			advsls = advsls + b[0];
			insertion(insertion[i], c);
			if (isSorted(insertion[i]) == false) {
				System.exit(0);
			}
			advins = advins + c[0];

			c[0] = 0;
			b[0] = 0;
		}
		advsls = advsls / 100;
		advins = advins / 100;
		System.out.println("adverage number of opperations in selsection sort:" + advsls);
		System.out.println("adverage number of opperations in insertion sort:" + advins);

	}
}
