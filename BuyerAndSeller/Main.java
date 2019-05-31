//Create two classes "Seller" and "Buyer".
//Seller has apples and determine the price.
//Buyer buy the apples through buy method.
//Buy method's parameter is (Seller, int).
//It means, buyer has to buy through seller.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Seller appleSeller = new Seller(2000, 10);
		Buyer appleBuyer = new Buyer(15000);
		
		int count = keyboard.nextInt();
		appleBuyer.buy(appleSeller, count);
		System.out.println("Buyer's balance: " + 
				appleBuyer.getBalance());
		System.out.println("Buyer's apple: " + 
				appleBuyer.getApple());
		
		keyboard.close();
	}
}

