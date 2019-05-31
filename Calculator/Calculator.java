import java.util.Scanner;

class Calculator {
  static int a, b, c;
  static double d, e, f;
  
  public static int add(int s_in1, int s_in2){
    a=(s_in1+s_in2);
    return a;
  }
  
  public static int subtract(int s_in1, int s_in2){
    b=(s_in1-s_in2);
    return b;
  }
  
  public static int multiple(int s_in1, int s_in2){
    c=(s_in1*s_in2);
    return c;
  }
  
  public static double add(double s_in1, double s_in2){
    d=(s_in1+s_in2);
    return d;
  }
  public static double subtract(double s_in1, double s_in2){
   e=(s_in1-s_in2);
    return e;
  }
  public static double multiple(double s_in1, double s_in2){
    f=(s_in1*s_in2);
    return f;
  }
}
