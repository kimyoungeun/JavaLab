//Create two classes "Seller" and "Buyer". 
//Seller has apples and determine the price. 
//Buyer buy the apples through buy method.
//Buy method's parameter is (Seller, int). 
//It means, buyer has to buy through seller.

import java.util.Scanner;

class Buyer {
  private int apple;
  private int balance;
  public int money;
  
  public Buyer (int s_ap){
   money =s_ap;
  }
  
  public int getBalance(){
    return balance;
  }
  public int getApple(){ return apple;}
  
  public void buy(Seller s_object, int s_count){
    //이 메소드를 통해 사과를 구매한다.(seller를 통해)
    if(s_count >=8) {
    System.out.println("Can't buy " +s_count + " apple(s)!");
    balance = 15000;
    apple =0;
    }
    else{
    balance = money - (2000*s_count);
    apple = s_count;
    }
  }
}
