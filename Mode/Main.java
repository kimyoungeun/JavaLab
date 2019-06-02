import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int n = 0, arr[];
		
		n = keyboard.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = keyboard.nextInt();
		
		System.out.println("Mode value is : " + 
					ModeFinder.find(arr));
		keyboard.close();
  }
}

