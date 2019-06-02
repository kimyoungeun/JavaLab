import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		
		for (int i = 0; i < 9; i++)
			matrix[i / 3][i % 3] = keyboard.nextInt();
		
		System.out.println(Matrix.calDeterminant(matrix));
		keyboard.close();
  }
}
