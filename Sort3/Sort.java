import java.util.Scanner;
import java.util.Arrays;

class Sort {
  // Your code here
  public static void sortByKey (int[] key, String[] value){
    for(int i=0; i< key.length; i++){
      for(int j = i+1; j <key.length; j++){
        if(key[i] > key[j]){
          int temp = key[i];
          String tem = value[i];
          
          key[i]= key[j];
          value[i]= value[j];
          
          key[j]= temp;
          value[j]= tem;
        }
      }
    }
  }
}
