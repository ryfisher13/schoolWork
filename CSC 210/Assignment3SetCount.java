package Programs;

public class Assignment3SetCount {

	public static void main(String[] args) {
//creates a variable to keep track of the sum of the odd numbers
		int sum = 0;
//creates a variable to count, test the count to see if its less than 50 and 
//increments the count by 2 so it is always odd
		for (int count = 1; count < 50; count += 2) {
//adds the odd numbers
			sum = sum + count;
		}
//prints the sum of the odd numbers
		System.out.println(sum);
	}

}
