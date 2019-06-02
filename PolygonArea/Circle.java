import java.util.Scanner;
import static java.lang.Math.PI;

class Circle extends Polygon {
  public Circle(Point p, double r) {
    super(p, r);
    // Your code here
  }
  
  public String toString() {
    return "Circle's area is " + PI * radius *radius;
    // Your code here
  }
}
