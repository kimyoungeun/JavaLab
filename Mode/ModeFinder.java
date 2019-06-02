import java.util.Scanner;

class ModeFinder {
  public static int find(int[] arr){
    int mode =0;
    int[] index = new int[arr.length];
    int max = Integer.MIN_VALUE;
    
    if(arr.length ==1){
      mode = arr[0];
    }
    else
    {
    for(int i=0;i<arr.length-1;i++){
                index[arr[i]]++; // count
      }
      
              for(int i=0;i<index.length-1;i++){
                      if(max<index[i]){
                             max = index[i];
                             mode = i;
                      }
              }
    }
    return mode;
  }
  // Your code here
}
