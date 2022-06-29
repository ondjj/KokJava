package sec04;

import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner 클래스 생성하는 방법
		// 클래스타입 변수명 = new 클래스타입(System.in);
		
		
		Scanner scanner = new Scanner(System.in);
		
		String inputData = scanner.nextLine();
		
		System.out.println(inputData);
	}

}
