package morningJava;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 정수형 배열의 크기를 스캐너로 입력받은 정수만큼 크기로 생성하고 1~10사이의 랜덤값을 입력 받는다.
		// 인접하는 요소가 동일한 값을 가지지 않도록 프로그램 해보자
		// 예 --> {1,3,5,5,3,2} 5가 연속해서 나오면 x

		Scanner in = new Scanner(System.in);
		int[] arr = new int[in.nextInt()];
		boolean flag = true;
		int cnt = 0;

		do {
			flag = true;
			cnt = 0;

			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 10) + 1;
			}

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[i + 1]) {
					cnt++;
				}
			}
			if (cnt == 0) {
				flag = false;
			}

			System.out.println(Arrays.toString(arr));
		} while (flag);

		System.out.println("=================================");

		System.out.print("내 풀이 : ");
		arr[0] = (int) (Math.random() * 10) + 1;

		for (int i = 1; i < arr.length; i++) {
			int temp = (int) (Math.random() * 10) + 1;
			if (arr[i - 1] != temp) {
				arr[i] = temp;
			}else {
				i--;
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("=================================");
		
		System.out.print("강사님 풀이 : ");
		arr[0] = (int) (Math.random() * 10) + 1;

		for (int i = 1; i < arr.length; i++) {
			do{
				arr[i] = (int)(Math.random()*10)+1;
			}while(arr[i]==arr[i-1]);
		}
		System.out.println(Arrays.toString(arr));
		
		

	}
}
