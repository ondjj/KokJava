package sec04;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int score = scanner.nextInt();
		
		if ( score >= 50) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("������� ������");
		}

	}

}
