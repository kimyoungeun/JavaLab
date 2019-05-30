//Create a class "Seller that include setters and sell methods.

//At first, there are 5 apples and price is 3,000 won per one apple.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
			Seller seller = new Seller();
			int number = 0;
			
			seller.setApple(5);
			seller.setApplePrice(3000);
			
			System.out.println("How many apples do you want?");
			number = keyboard.nextInt();
			seller.sell(number);
			
			System.out.println("How many apples do you want?");
			number = keyboard.nextInt();
			seller.sell(number);
			
			keyboard.close();
  }
}
