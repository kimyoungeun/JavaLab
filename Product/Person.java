import java.util.Scanner;

class Person {
  private int balance;
  private int count=0;
  public String myItems[]= new String[10];
  Person(int s_balance){
    balance = s_balance;
  }
  public void buy(Product product){
    if(balance >=product.price){
      balance = balance- product.price;
      myItems[count]= product.name;
      count++;
    }
  }
  public int getBalance(){
    return balance;
  }
  public int getItemsCount(){
    return count;
  }
  // Your code here
}
