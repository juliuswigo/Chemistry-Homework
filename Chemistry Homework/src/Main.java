import java.util.Scanner;

public class Main {
  static double Answer;

  public static void main(String[] args) {

    Variables Yes = new Variables();
    int i;

    System.out.println("How many Elements?");
    Scanner input = new Scanner(System.in);
    i = input.nextInt();
    Answer = Yes.calculateElements(i);
    System.out.println(Answer);
  }

}
