package afternoonJava.constructor;

public class RectangleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec1 = new Rectangle(2, 2, 8, 7);
		Rectangle rec2 = new Rectangle(5, 5, 8, 7);
		Rectangle rec3 = new Rectangle(1, 1, 10, 10);
		
		rec1.show();
		System.out.println("rec1의 넓이는 "+rec1.area()+"입니다."); 
		System.out.println(rec1);
		
		if(rec3.including(rec1)) {
			System.out.println("rec3은 rec1을 포함합니다.");
		}else {
			System.out.println("rec3은 rec1을 포함하지 않습니다.");
		}
		
		if(rec3.including(rec2)) {
			System.out.println("rec3은 rec2을 포함합니다.");
		}else {
			System.out.println("rec3은 rec2을 포함하지 않습니다.");
		}

	}



}
