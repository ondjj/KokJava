package afternoonJava.constructor;

public class NewCar {

	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	NewCar(){
			
		}

	NewCar(String model){
			this(model, "����", 80);
		}

	NewCar(String model, String color){
			this(model, color, 100);
		}

	NewCar(String model, String color, int maxSpeed){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
}