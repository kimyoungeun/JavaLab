import java.util.Scanner;
import static java.lang.Math.PI;

class Triangle extends Polygon {
  public Triangle(Point p, double r) {
   super(p, r);
    // Your code here
  }
  
  public String toString() {
    return "Triangle's area is ." +((3*(Math.sqrt(3)))/4)*radius *radius;
    // Your code here
  }
}
