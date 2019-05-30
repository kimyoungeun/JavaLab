//Create a class "Account" that include withdraw, deposit methods and private balance instance variable.
  
//In withdraw method, there is a check logic that can user withdraw or not.
//If user can't withdraw, print "Can't withdraw.".
//Be careful of using punctuation point. (In detail, see Sample output 2)

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int money = 0;
		Scanner keyboard = new Scanner(System.in);
		Account account = new Account();
		
		// Set balance to 10000 won.
		account.setBalance(10000);
		System.out.println("Balance: " + account.getBalance());
		
		// Withdrawal (minus impossible)
		System.out.print("Amount to be withdrawn: ");
		money = keyboard.nextInt();
		account.withdraw(money);
		System.out.println("Balance: " + account.getBalance());
		
		// Deposit
		System.out.print("Amount to be deposited: ");
		money = keyboard.nextInt();
		account.deposit(money);
		System.out.println("Balance: " + account.getBalance());
		
		keyboard.close();
  }
}
