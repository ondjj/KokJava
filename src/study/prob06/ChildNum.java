package study.prob06;

import java.util.Scanner;

public class ChildNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if((num%2==0) || (num%3==0)) {
			
			System.out.printf("%d�� �ڼ��� �ƴմϴ�.", num);
		}else {
			System.out.printf("%d�� �ڼ��Դϴ�.", num);
		}

	}

}
