import java.util.Scanner;
import java.util.Random;

class Eliminator {
  // Your code here
  public static void eliminate(int[] arr, int del){
    for(int i =0; i< arr.length; i++)
    {
      if(arr[i] % del ==0)
        arr[i] = 0;
      else 
        arr[i] = arr[i];
    }  
  }
}
