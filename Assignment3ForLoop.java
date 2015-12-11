package Programs;

public class Assignment3ForLoop {
	public static void main(String[] args) {
		//creates a loop that increments i from 1 to 5 then leaves
		for (int i = 1; i < 6; i++) {
			//creates a loop that increments j from 1 to 5 then goes back to the loop above
			for (int j = 1; j < 6; j++) {
				//prints out the equation that it is calculates then the answer
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}
}