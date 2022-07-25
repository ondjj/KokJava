package morningJava;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 정수형 배열의 크기를 스캐너로 입력받은 정수만큼 크기로 생성하고 1~10사이의 랜덤값을 입력 받는다.
		// 배열 요소가 동일한 값을 가지지 않도록 프로그램 해보자
		// 예 --> {1,3,5,5,3,2} 5가 동일하게 나오면 x
		
		Scanner in = new Scanner(System.in);
		int[] arr = new int[in.nextInt()];
		System.out.print("내 풀이 : ");
		
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
