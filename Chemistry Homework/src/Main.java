import java.util.Scanner;

public class Main {
static double Answer;	
	public static void main(String[] args) {	
		
		
		Variables Yes = new Variables();
		int i;
		
		System.out.println("How many Elements?");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		if (i == 2) {Yes.twoElements();
		Answer = Yes.Divide;
		System.out.println(Answer);
		}

	}
}