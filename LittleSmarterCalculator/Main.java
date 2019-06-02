import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int size = keyboard.nextInt();
		
		int[] iarr = new int[size];
		double[] darr = new double[size];
		
		for (int i = 0; i < size; i++)
			iarr[i] = keyboard.nextInt();
		
		for (int i = 0; i < size; i++)
			darr[i] = keyboard.nextDouble();
		
		System.out.println(LittleSmarterCalculator.add(iarr));
		System.out.println(LittleSmarterCalculator.add(darr));
		keyboard.close();
  }
}
