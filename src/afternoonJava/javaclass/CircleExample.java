package afternoonJava.javaclass;

public class CircleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle cir = new Circle();
		
		System.out.println(cir.radius);
		
		cir.radius = 5.0;
		System.out.println(cir.radius);
		
		System.out.print("반지름이 5인 원의 지름 : ");
//		System.out.println((cir.radius*cir.radius)*3.14);
		cir.getArea();
		cir.getArea(10);
		
		
		System.out.println("==============================");
		Retangle ret = new Retangle();
		
		System.out.print(ret.width +" "+ ret.height);
		
		ret.width = 10;
		ret.height = 5;
		System.out.println();
		
		System.out.print(ret.width +" "+ ret.height);
		System.out.println();
		
		System.out.print("넓이가 10, 높이가 5인 사각형의 지름 : ");
		System.out.println(ret.width * ret.height);
		ret.getArea();
		ret.getArea(14, 3);
		
		double a = ret.getArea2(14, 3);
		System.out.println(a);
				

	}

}
