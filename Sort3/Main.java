import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		
		int[] key = new int[n];
		String[] value = new String[n];
		
		for (int i = 0; i < n; i++) {
			key[i] = keyboard.nextInt();
			value[i] = keyboard.next();
		}

		Sort.sortByKey(key, value);
		for (int i = 0; i < n; i++)
			System.out.println(value[i]);
		
		keyboard.close();
  }
}
