import java.util.Scanner;
import java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x = 0, y = 0;
		
		x = keyboard.nextDouble();
		y = keyboard.nextDouble();
		Position p1 = new Position(x, y);
		
		x = keyboard.nextDouble();
		y = keyboard.nextDouble();
		Position p2 = new Position(x, y);
		
		System.out.println("Distance between [" + p1.getX() + ", " + 
				p1.getY() + "] and [" + p2.getX() + ", " + 
				p2.getY() + "] is " + p1.getDistance(p2));
		keyboard.close();
	}
}
