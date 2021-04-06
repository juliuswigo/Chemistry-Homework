import java.util.Scanner;

public class Variables {
	Scanner input = new Scanner(System.in);
	public double Comp;
	public int CompTimes;
	public double Massofpart;
	public double firstelement;
	public int firsttimes;
	public double Massofwhole;
	public double Divide;
	Main main = new Main();
	
	
	public double twoElements() {
		System.out.println("Mass of % composition you want to find");
		Comp = input.nextDouble();
		System.out.println("How many moles of "+ Comp + " are you finding?");
		CompTimes = input.nextInt();
		Massofpart = Comp * CompTimes;
		System.out.println("Mass of the next Element");
		firstelement = input.nextDouble();
		System.out.println("How many moles of "+ firstelement +" are there?");
		firsttimes = input.nextInt();
		
		Massofwhole = Massofpart + (firstelement *firsttimes);
		Divide = Massofpart/Massofwhole * 100;
		
		return Divide;
		
	}	
	
	
	
	
}
