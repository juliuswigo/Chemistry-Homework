import java.util.Scanner;

public class Main {
static double Answer;	
	public static void main(String[] args) {	
		
		
		Variables Yes = new Variables();
		int elementCounter;
		
		System.out.println("How many Elements?");
		Scanner input = new Scanner(System.in);
		elementCounter = input.nextInt();
		for (int i = 0; i<elementCounter; i++) {
			Yes.twoElements();
			Answer = Yes.Divide;
			System.out.println(Answer);
		}
	}
}
