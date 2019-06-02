import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int x = 0, y = 0, type = 0;
		double r = 0;
		Polygon p;
		
		System.out.println("Input x, y, r");
		x = keyboard.nextInt();
		y = keyboard.nextInt();
		r = keyboard.nextDouble();
		
		System.out.println("Input type - 1: circle | 2: triangle | 3: square | others: polygon");
		type = keyboard.nextInt();
		
		// Your code here
		// Don't use System.out.println at here.
		// System.out.println should be placed on explain function.
		
    if(type ==1)
      p = new Circle(new Point(x, y), r);
      
		else if(type ==2)
		  p = new Triangle(new Point(x, y), r);
		  
		else if(type ==3)
		  p= new Square(new Point(x, y), r);
		  
		else
		  p= new Polygon(new Point(x, y), r);
		
		p.explain();
		
		keyboard.close();
  }
}
