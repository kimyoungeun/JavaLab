import java.util.Scanner;

class LittleSmarterCalculator {
  
  public static int add(int[] ia){
    int sum =0;
    for(int i=0; i< ia.length; i++)
      sum += ia[i];
    return sum;
  }
  
  public static double add(double[] da){
    double sumsum =0;
    for (int j=0 ; j <da.length; j++)
      sumsum += da[j];
    return sumsum;
  }
  // Your code here
}
