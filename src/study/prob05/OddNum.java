package study.prob05;

import java.util.Scanner;

public class OddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է�1:");
		int num1 = scanner.nextInt();
		
		System.out.print("���� �Է�2:");
		int num2 = scanner.nextInt();
		
		for(num1; num1<=num2 || num1 >= num2; num1++) {
			System.out.println(num1);
		}
		
		

	}

}
