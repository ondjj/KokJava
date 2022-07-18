package study.prob09;

import java.util.Scanner;

public class InsertDelete {

	public static void main(String[] args) {
		/*
		 * �� ������ �迭 50���� �����ϰ� 20���� 1~100������ ������ �Է� �۾�����(1: ����, 2: ����) : ������ ��ġ : ������ �� :
		 * ������ �Ŀ� ������ ��� ���� �۾��� ���������� �۾�
		 */

		Scanner in = new Scanner(System.in);

		int[] arr = new int[20];
		int[] copyArr = new int[20];

		for (int i = 0; i < copyArr.length; i++) {
			copyArr[i] = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 - 1) + 1) + 1;
		}

		System.out.print("���� �� : ");
		for (int i : arr) {
			System.out.print(i + " ");

		}

		System.out.println();

		System.out.print("�۾�����(1: ����, 2: ����) : ");

		int select = in.nextInt();

		System.out.println();

		switch (select) {
		case 1: {

			System.out.print("���� ��ġ : ");

			int insert = in.nextInt();

			System.out.println();

			for (int i = 0; i < arr.length; i++) {

				if (i == insert) {
					for (int j = insert + 1; j < arr.length; j++) {
						int temp = arr[i + 1];
						arr[i + 1] = arr[i];
						
						arr[i] = temp;
						
						/* System.arraycopy(copyArr, i, arr, i+1,arr.length-i); */
					}
					
				}
				break;
			}

			System.out.print("���� �� �� : ");
			arr[insert] = in.nextInt();

			System.out.print("��ȯ �� : ");
			for (int i : arr) {
				System.out.print(i + " ");
			}

			break;
		}

		case 2: {

			System.out.print("���� ��ġ : ");

			int delete = in.nextInt();

			System.out.println();

			for (int i = 0; i < arr.length; i++) {
				if (i == delete) {

					arr[i] = 0;
				}
			}

			break;
		}

		default:
			System.out.print("�߸��� �Է��Դϴ�.");
			break;
		}

	}

}
