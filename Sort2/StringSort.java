import java.util.Scanner;

class StringSort {
  public static void sort(String[] arr) {
    	int n= arr.length;
    	String temp;
    	
		   for (int a = 0; a < n; a++) 
        {
            for (int j = a + 1; j < n; j++) { 
                if (arr[a].length() > (arr[j]).length()) 
                {
                    temp = arr[a];
                    arr[a] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    // Your code here
  }
}
