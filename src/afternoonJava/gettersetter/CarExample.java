package afternoonJava.gettersetter;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		
		System.out.println("번경 전 : " + car1.getSpeed());

		
		car1.setSpeed(40);
		System.out.println("변경 후 : " + car1.getSpeed());
	}

}
