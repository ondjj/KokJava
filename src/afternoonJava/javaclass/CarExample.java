package afternoonJava.javaclass;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		System.out.println("���� ȸ�� : "+ car.company);
		System.out.println("�𵨸� : "+ car.model);
		System.out.println("���� : "+ car.color);
		System.out.println("�ְ� �ӵ� : "+ car.maxSpeed);
		System.out.println("���� �ӵ� : "+ car.speed);
		
		System.out.println();
		
		car.company = "����ڵ���";
		car.color = "����";
		car.maxSpeed = 380;
		car.speed = 100;
		car.model = "ī�Ϲ�";
		
		System.out.println("���� ȸ�� : "+ car.company);
		System.out.println("�𵨸� : "+ car.model);
		System.out.println("���� : "+ car.color);
		System.out.println("�ְ� �ӵ� : "+ car.maxSpeed);
		System.out.println("���� �ӵ� : "+ car.speed);
		
		System.out.println();
		
		Car kia = new Car();
		kia.company = "����ڵ���";
		kia.color = "����";
		kia.maxSpeed = 380;
		kia.speed = 100;
		kia.model = "ī�Ϲ�";
		
		System.out.println("���� ȸ�� : "+ kia.company);
		System.out.println("�𵨸� : "+ kia.model);
		System.out.println("���� : "+ kia.color);
		System.out.println("�ְ� �ӵ� : "+ kia.maxSpeed);
		System.out.println("���� �ӵ� : "+ kia.speed);
		
		
		Car kar = new Car("����", 3000);
		
		int a = kar.cc;
		String b = kar.color;
		
		System.out.print(b + a);
		
		Car kar2 = new Car();
		
	}

}
