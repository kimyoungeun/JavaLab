import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		
		System.out.println(Factorial.fac(n));
		keyboard.close();
  }
}
