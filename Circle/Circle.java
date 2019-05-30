//Create a class "Circle" that include getArea, getPerimeter and setRadius methods.

//We call setRadius method as setter which set the value of private instance variable.

//All instance variables must be private!
//Use Math.PI

import java.util.Scanner;
import java.lang.Math.*;

class Circle {
  // Your code here
  private int radius;
  private float area;
  private float perimeter;
  
  public void setRadius(int s_radius){
    radius= s_radius;  
  }
  
  public float getArea(){
    float area = (float)Math.PI*radius;
    area = (float)area*radius;
    return area;
  }
  
  public float getPerimeter(){
    perimeter= (float)radius*2;
    perimeter = (float)Math.PI*perimeter;
    return perimeter;
  }
  
}
