import java.util.Scanner;

class Car extends Motor{
	private String name;
	private int highSpeed;
	
	public Car(String name, int range) {
    super(0);
		this.name = name;
		this.highSpeed = range;
	}
	
	public void speedUp(int speed) {
		if (super.getSpeed() + speed > highSpeed)
			System.out.println("Can't accelerate!");
		else
			super.speedUp(speed);
	}
	
	public String toString() {
		return name + "'s current speed : " + this.getSpeed();
	}
}
