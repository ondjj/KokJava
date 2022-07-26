package afternoonJava.javaclass;

public class Calculator {

	int num1, num2;
	char ch;

	Calculator() {

	}

	void add(int num1, int num2, char ch) {
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.println("더하기 : " + (num1 + num2));
		System.out.println();
	}

	void minus(int num1, int num2, char ch) {
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		System.out.println("빼기 : " + (num1 - num2));
		System.out.println();
	}

	void multiple(int num1, int num2, char ch) {
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		System.out.println("곱하기 : " + (num1 * num2));
		System.out.println();
	}

	void division(int num1, int num2, char ch) {
		System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / num2));
		System.out.println("나누기 : " + ((double) num1 / num2));
		System.out.println();
	}

	double Cal(int num1, int num2, char ch) {
		if (ch == '+') {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			System.out.println("더하기 : " + (num1 + num2));
			double result = (double) num1 + num2;
			return result;
		} else if (ch == '-') {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			System.out.println("빼기 : " + (num1 - num2));
			double result = (double) num1 - num2;
			return result;
		} else if (ch == '*') {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			System.out.println("곱하기 : " + (num1 * num2));
			double result = (double) num1 * num2;
			return result;
		} else {
			System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / num2));
			System.out.println("나누기 : " + ((double) num1 / num2));
			double result = (double) num1 / num2;
			return result;
		}
	}

}
