import java.util.Scanner;

class Product {
  
  public static int a =1;
  
  public int getSerialNumber(){
    ++a;
    return (a-1);
  }

}
