//Create a class "Account" that include withdraw, deposit methods and balance instance variable.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int money = 0;
		Scanner keyboard = new Scanner(System.in);
		Account account = new Account();
		
		// Set balance to 10000 won.
		account.balance = 10000;
		System.out.println("Balance: " + account.balance);
		
		// Withdrawal (minus available)
		System.out.print("Amount to be withdrawn: ");
		money = keyboard.nextInt();
		account.withdraw(money);
		System.out.println("Balance: " + account.balance);
		
		// Deposit
		System.out.print("Amount to be deposited: ");
		money = keyboard.nextInt();
		account.deposit(money);
		System.out.println("Balance: " + account.balance);
		
		keyboard.close();
  }
}
