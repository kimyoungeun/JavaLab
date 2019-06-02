import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		String[] strings;
		int n  = 0, i = 0;
		
		n = keyboard.nextInt();
		strings = new String[n];
		String temp ;
		
		// Input your code
		for(i=0; i< n; i++)
		  strings[i] = keyboard.next();
		  
		   for (int a = 0; a < n; a++) 
        {
            for (int j = a + 1; j < n; j++) { 
                if (strings[a].compareTo(strings[j])>0) 
                {
                    temp = strings[a];
                    strings[a] = strings[j];
                    strings[j] = temp;
                }
            }
        }
		  

		for (i = 0; i < n; i++)
			System.out.println(strings[i]);
		
		keyboard.close();
  }
}
