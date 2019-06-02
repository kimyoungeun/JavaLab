import java.util.Scanner;
import static java.lang.Math.PI;

class Square extends Polygon {
  public Square(Point p, double r) {
  super(p, r);
    // Your code here
  }
  
  public String toString() {
    return "Square's area is" + 2*radius*radius;
    // Your code here
  }
}
