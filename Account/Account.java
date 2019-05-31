import java.util.Scanner;

class Account {
  private String owner;
  private int balance;
  
  public Account(String s_name, int s_money){
    owner = s_name;
    balance = s_money;
  }
  
  public void printStatus(){
    System.out.println(owner + "'s account.");
    System.out.println("Balance: " + balance);
  } 
  
  public String getName() {return owner;}
	public int getAge() {return balance;}
}
