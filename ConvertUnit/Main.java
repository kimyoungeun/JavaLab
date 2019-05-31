import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int inch = 0;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Input value (inch): ");
		inch = keyboard.nextInt();
		
		// inch / 12 = feet
		System.out.println(inch + " inch is " + 
			String.format("%.3f", Convertor.inchToFeet(inch)) + " ft.");
		// inch / 36 = yard
		System.out.println(inch + " inch is " + 
			String.format("%.3f", Convertor.inchToYard(inch)) + " yard.");
		// inch * 2.54 = cm
		System.out.println(inch + " inch is " + 
			String.format("%.3f", Convertor.inchToCm(inch)) + " cm.");
		
		keyboard.close();
	}
}
