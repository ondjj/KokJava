package afternoonJava.constructor;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		
		System.out.print("ȸ�� : ");
		System.out.println(car1.company);
		
		System.out.println("======================");
		
		Car car2 = new Car("����");
		
		System.out.print("ȸ�� : ");
		System.out.println(car2.company);
		System.out.print("�� : ");
		System.out.println(car2.model);
		
		System.out.println("======================");
		
		Car car3 = new Car("�ý�", "���");
		
		System.out.print("ȸ�� : ");
		System.out.println(car3.company);
		System.out.print("�� : ");
		System.out.println(car3.model);
		System.out.print("���� : ");
		System.out.println(car3.color);
		
		System.out.println("======================");
		
		Car car4 = new Car("�ڰ���", "����", 300);
		
		System.out.print("ȸ�� : ");
		System.out.println(car4.company);
		System.out.print("�� : ");
		System.out.println(car4.model);
		System.out.print("���� : ");
		System.out.println(car4.color);
		System.out.print("�ִ�ӵ� : ");
		System.out.println(car4.maxSpeed);
		
		System.out.println(car4);
		System.out.println(car4.toString());
		

	}

}
