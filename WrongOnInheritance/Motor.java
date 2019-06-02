import java.util.Scanner;

class Motor {
	private int speed;
	
	public Motor(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		if (this.speed < 0)
			this.speed = 0;
	}
}
