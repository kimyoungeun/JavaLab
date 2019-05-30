//Create a class "Account" that include withdraw, deposit methods and balance instance variable.

import java.util.Scanner;

class Account {
  public int balance =0;
  public int moneyy ;
  
  public void withdraw(int moneyy){
    balance = balance - moneyy;
  }
  
  public void deposit(int moneyy){
    balance = balance + moneyy;
  }
}
