import java.util.Scanner;

class Calculator {
  public static double average(int[] arr){
    double temp = 0;
    for (int i=0; i< arr.length; i++)
      temp = temp + arr[i];
  
    double ave = temp/ (arr.length);
    return ave;
  }
}
