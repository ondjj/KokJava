package afternoonJava.gettersetter;

public class Car {

	private int speed = 10;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {

		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}

}
