package afternoonJava.constructor;

public class RectangleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec1 = new Rectangle(2, 2, 8, 7);
		Rectangle rec2 = new Rectangle(5, 5, 8, 7);
		Rectangle rec3 = new Rectangle(1, 1, 10, 10);
		
		rec1.show();
		System.out.println("rec1�� ���̴� "+rec1.area()+"�Դϴ�."); 
		System.out.println(rec1);
		
		if(rec3.including(rec1)) {
			System.out.println("rec3�� rec1�� �����մϴ�.");
		}else {
			System.out.println("rec3�� rec1�� �������� �ʽ��ϴ�.");
		}
		
		if(rec3.including(rec2)) {
			System.out.println("rec3�� rec2�� �����մϴ�.");
		}else {
			System.out.println("rec3�� rec2�� �������� �ʽ��ϴ�.");
		}

	}



}
