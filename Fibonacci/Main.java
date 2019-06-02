import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
      int n = 0;
      
      n = keyboard.nextInt();      
      System.out.println(Fibonacci.fib(n));
      
      keyboard.close();
  }
}
