package afternoonJava.constructor;

public class Car {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	
	Car(){
		
	}
	
	Car(String model){
		this(model, "����", 80);
	}
	
	Car(String model, String color){
		this(model, color, 100);
	}
	
	

	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String toString() {
		String str = "ȸ�� : " + company + "\nmodel : " + model + "\n���� : " + color + "\n�ְ� �ӵ� : " + maxSpeed;
		return str;
	}
}
