//Create two classes "Seller" and "Buyer". 
//Seller has apples and determine the price. 
//Buyer buy the apples through buy method.
//Buy method's parameter is (Seller, int). 
//It means, buyer has to buy through seller.

import java.util.Scanner;

class Seller {
  private int pricePerApple;
  private int apple;
  
  public Seller(int s_price, int s_apple){
    pricePerApple =s_price;
    apple= s_apple;
  }
}
