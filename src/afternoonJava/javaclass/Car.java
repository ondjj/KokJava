package afternoonJava.javaclass;

// Ŭ���� ����
public class Car {
	
	// �ʵ� ����
	// String Ÿ���� company �ʵ带 ���� ( �ʱⰪ -> �����ڵ���)
	String company = "�����ڵ���";
	
	String model = "�׷���";
	
	String color = "����";
	
	int maxSpeed = 350;
	
	int speed;
	
	int cc;
	
	Car(){
		
	}
	
	Car(String color, int cc){
		this.color = color;
		this.cc = cc;
	}

}

// �� �� �̻��� Ŭ������ ����� �ҽ� ����(.java)�� ������ �ϸ�
// ����Ʈ �ڵ� ����(.class)�� Ŭ������ ������ �� �� ��ŭ �����̵ȴ�.
// ������ ��� Car.class Tire.class�� ���� �����ȴ�.
//class Tire {
//	
//}
