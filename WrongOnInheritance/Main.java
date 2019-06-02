import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		Motor m = new Motor(0);
		Car oldCar = new Car("Martiz", 100);
		Car newCar = new Car("Genesis", 200);
		
		oldCar.speedUp(keyboard.nextInt());
		newCar.speedUp(keyboard.nextInt());
		System.out.println(oldCar);
		System.out.println(newCar);
		
		keyboard.close();
  }
}
