package morningJava;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// ������ �迭�� ũ�⸦ ��ĳ�ʷ� �Է¹��� ������ŭ ũ��� �����ϰ� 1~10������ �������� �Է� �޴´�.
		// �迭 ��Ұ� ������ ���� ������ �ʵ��� ���α׷� �غ���
		// �� --> {1,3,5,5,3,2} 5�� �����ϰ� ������ x
		
		Scanner in = new Scanner(System.in);
		int[] arr = new int[in.nextInt()];
		System.out.print("�� Ǯ�� : ");
		
		arr[0] = (int) (Math.random() * 10) + 1;

		for (int i = 1; i < arr.length; i++) {
			int j;
			do {
				arr[i] = (int)(Math.random()*10)+1;
				for (j = 0; j < i; j++) {
					if(arr[i]==arr[j]) break;
					
				}
			}while(j<i);
		
		}
		System.out.println(Arrays.toString(arr));

	}

}
