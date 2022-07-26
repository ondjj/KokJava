package afternoonJava.javaclass;

public class Circle {
	double radius;
	int width;
	int height;

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
	
	void getArea() {
		System.out.println(width*height);
	}
	
	void getArea(double width, double height) {
		System.out.println(width * height);
	}
	
	double getArea2(double w, double h) {
		
		double result = w*h;
		
		return result;
	}
}
