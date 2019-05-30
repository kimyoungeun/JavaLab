//Create a class "Account" that include withdraw, deposit methods and private balance instance variable.

//In withdraw method, there is a check logic that can user withdraw or not. 
//If user can't withdraw, print "Can't withdraw.". 
//Be careful of using punctuation point. (In detail, see Sample output 2)

import java.util.Scanner;

class Account {
  private int balance =0;
  private int moneyy;
  
  public void setBalance(int Balance){
    balance = Balance;
  }
  
  public int getBalance(){
    return balance;
  }
  
  public void withdraw(int moneyy){
    if(balance - moneyy < 0){
      System.out.println();
      System.out.println("Can't withdraw.");
    }
    else 
      balance = balance - moneyy;
  }
  
  public void deposit(int moneyy){
    System.out.println();
    balance = balance + moneyy;
  }
  // Balance variable here
  
  // Set Balance method here
  
  // Deposit method here
  
  // Withdraw method here
}
