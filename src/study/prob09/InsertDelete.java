package study.prob09;

import java.util.Scanner;

public class InsertDelete {

	public static void main(String[] args) {
		/*
		 * ■ 정수형 배열 50개를 생성하고 20개의 1~100까지의 랜덤값 입력 작업선택(1: 삽입, 2: 삭제) : 삽입할 위치 : 삽입할 값 :
		 * 삽입한 후에 데이터 출력 삭제 작업도 마찬가지로 작업
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

		System.out.print("생성 값 : ");
		for (int i : arr) {
			System.out.print(i + " ");

		}

		System.out.println();

		System.out.print("작업선택(1: 삽입, 2: 삭제) : ");

		int select = in.nextInt();

		System.out.println();

		switch (select) {
		case 1: {

			System.out.print("삽입 위치 : ");

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

			System.out.print("삽입 할 값 : ");
			arr[insert] = in.nextInt();

			System.out.print("변환 값 : ");
			for (int i : arr) {
				System.out.print(i + " ");
			}

			break;
		}

		case 2: {

			System.out.print("삭제 위치 : ");

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
			System.out.print("잘못된 입력입니다.");
			break;
		}

	}

}
