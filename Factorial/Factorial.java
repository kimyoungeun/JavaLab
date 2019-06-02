import java.util.Scanner;

class Factorial {
  public static long fac(int n){
  long fact =1;
  long[] arr =new long[n+1];
  arr[1]=1;
  for(int i=1;i<=n;i++){
    fact =1;
    for(int j=1; j<=i;j++){
      fact = fact*j;
    }
    arr[i]= fact;
  }
    return arr[n];
  }
}
