package afternoonJava.constructor;

public class Rectangle {
	private int x, y, width, height;

	Rectangle() {

	}

	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	

//	int area(int width, int height) {
//		int result = width * height;
//		return result;
//	}

	int area() {
		int result = width * height;
		return result;
	}

//	void show(int x, int y, int width, int height) {
//		System.out.println("(" + x + "," + y + ")" + "���� ũ�Ⱑ " + width + "*" + height + "�� �簢��");
//	}

	void show() {
		System.out.println("(" + x + "," + y + ")" + "���� ũ�Ⱑ " + width + "*" + height + "�� �簢��");
	}

	@Override
	public String toString() {
		String str = "�ʵ尪 : " + "x=" + x + ", " + "y=" + y + "," + "width=" + width + "," + "height=" + height;
		return str;
	}

	boolean including(Rectangle r) {
		if ((x < r.x && y < r.y) && (x + width > r.x + r.width && y + height > r.height)) {

			return true;
		}

		return false;

	}

}
