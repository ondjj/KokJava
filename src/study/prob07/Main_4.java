package study.prob07;

import java.util.Iterator;
import java.util.Scanner;

public class Main_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���� �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� ��������
		 * 1, 2, 0, 2�̴�. �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ�
		 * ���α׷��� �ۼ��Ͻÿ�. �Է� ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ����
		 * �ƴ� �����̴�.
		 * 
		 * ��� ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.
		 */

		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;

		for (int i = 0; i < 10; i++) {
			arr[i] = scanner.nextInt();
			arr[i] = arr[i] % 42;
			System.out.println(">>>"+arr[i]);
		}
		for (int j = 0; j < 10; j++) {
			if (arr[j] != arr[j]+1) {
				System.out.println(">>>>"+arr[j]);
				count++;
			}else {
				
			}
		}
		System.out.println(count);
		scanner.close();

	}

}
