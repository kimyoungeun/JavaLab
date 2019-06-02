import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		int n = keyboard.nextInt();
		int del = keyboard.nextInt();
		rand.setSeed(n);
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = rand.nextInt(100);
		
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		Eliminator.eliminate(arr, del);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		
		keyboard.close();
  }
}
