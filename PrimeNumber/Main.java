//Create a class "Prime" that include nextPrime method.

//Use instance variable

import java.util.Scanner;
import java.lang.Math.*;

class Main {
  public static void main(String[] args) {
      Prime p = new Prime();
      Scanner keyboard = new Scanner(System.in);
      
      int n = keyboard.nextInt();
      for (int i = 0; i < n; i++)
         System.out.println(p.nextPrime());
      keyboard.close();
  }
}
