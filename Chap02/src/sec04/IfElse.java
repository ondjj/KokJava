package sec04;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int score = scanner.nextInt();
		
		if ( score >= 50) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("재시험을 보세요");
		}

	}

}
