package Programs;

public class Assignment3Rootish {

	public static void main(String[] args) {
		//Create a variable to test
		int x = 0;
		//create a for loop to be used as an if statement that automatically repeats itself to test if that
		// the current number squared is greater than 12000
		for (; x * x < 12000; x++) ;
		//print findings
		System.out.println("smallest number squared that is greater than 12000:" + x);
	}

}
