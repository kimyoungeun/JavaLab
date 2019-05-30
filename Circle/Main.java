//Create a class "Circle" that include getArea, getPerimeter and setRadius methods.

//We call setRadius method as setter which set the value of private instance variable.

//All instance variables must be private!
//Use Math.PI

import java.util.Scanner;
import java.lang.Math.*;

class Main {
  public static void main(String[] args) {
    int radius = 0;
		Circle c = new Circle();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input the radius: ");
		radius = keyboard.nextInt();
		
		c.setRadius(radius);
		System.out.println("Area of circle: " + 
					String.format("%.2f", c.getArea()));
		System.out.println("Perimeter of circle: " +
					String.format("%.2f", c.getPerimeter()));
		
		keyboard.close();

  }
}
