package afternoonJava.constructor;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	
	Car(){
		
	}
	
	Car(String model){
		this(model, "검정", 80);
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
		String str = "회사 : " + company + "\nmodel : " + model + "\n색깔 : " + color + "\n최고 속도 : " + maxSpeed;
		return str;
	}
}
