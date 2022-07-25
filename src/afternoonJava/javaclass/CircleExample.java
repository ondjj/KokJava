package afternoonJava.javaclass;

public class CircleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle cir = new Circle();
		
		System.out.println(cir.radius);
		
		cir.radius = 5.0;
		System.out.println(cir.radius);
		
		Retangle ret = new Retangle();
		
		System.out.print(ret.width +" "+ ret.height);
		
		ret.width = 10;
		ret.height = 5;
		System.out.println();
		System.out.print(ret.width +" "+ ret.height);
				

	}

}
