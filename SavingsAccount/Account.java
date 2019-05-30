//Create a class "Account" that include setters and getAfterOneYear methods.

//Use instance variable

//Hint : balance += balance * rate / 100;

import java.util.Scanner;

class Account {
  // Your code here
  private double money;
  private double rate;
  
  public void setMoney(double s_money){
    money= s_money;
  }
  public void setInterestRate(double s_rate){
    rate=s_rate;
  }
  public double getAfterOneYear(){
      double down = rate/100 +1;
		  double up = 12;
		  money = money * Math.pow(down,up);
	    return money;
  }
}
