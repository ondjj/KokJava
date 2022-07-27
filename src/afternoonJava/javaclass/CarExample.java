package afternoonJava.javaclass;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		System.out.println("제작 회사 : "+ car.company);
		System.out.println("모델명 : "+ car.model);
		System.out.println("색깔 : "+ car.color);
		System.out.println("최고 속도 : "+ car.maxSpeed);
		System.out.println("현재 속도 : "+ car.speed);
		
		System.out.println();
		
		car.company = "기아자동차";
		car.color = "빨강";
		car.maxSpeed = 380;
		car.speed = 100;
		car.model = "카니발";
		
		System.out.println("제작 회사 : "+ car.company);
		System.out.println("모델명 : "+ car.model);
		System.out.println("색깔 : "+ car.color);
		System.out.println("최고 속도 : "+ car.maxSpeed);
		System.out.println("현재 속도 : "+ car.speed);
		
		System.out.println();
		
		Car kia = new Car();
		kia.company = "기아자동차";
		kia.color = "빨강";
		kia.maxSpeed = 380;
		kia.speed = 100;
		kia.model = "카니발";
		
		System.out.println("제작 회사 : "+ kia.company);
		System.out.println("모델명 : "+ kia.model);
		System.out.println("색깔 : "+ kia.color);
		System.out.println("최고 속도 : "+ kia.maxSpeed);
		System.out.println("현재 속도 : "+ kia.speed);
		
		
		Car kar = new Car("검정", 3000);
		
		int a = kar.cc;
		String b = kar.color;
		
		System.out.print(b + a);
		
		Car kar2 = new Car();
		
	}

}
