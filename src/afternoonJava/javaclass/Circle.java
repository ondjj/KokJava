package afternoonJava.javaclass;

public class Circle {
	double radius;

	Circle() {

	}

	void getArea() {
		System.out.println(radius * radius * 3.14);
	}
	
	void getArea(int n1) {
		System.out.println(n1 * n1 * 3.14);
	}

}

class Retangle {
	double width;
	double height;
}
