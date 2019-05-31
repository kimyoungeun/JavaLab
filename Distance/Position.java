import java.util.Scanner;
import java.lang.Math.*;

class Position {
  private double x, y;
  
  public Position(double s_x, double s_y){
    x= s_x;
    y=s_y;
  }
  public double getX(){ return x;}
  public double getY(){ return y;}
  
  public double getDistance(Position s_object){
    return Math.sqrt(Math.pow(Math.abs(s_object.x-x),2)+Math.pow(Math.abs(s_object.y-y),2));
  }
  // Your code here
}
