package study.quiz01;

import java.util.Scanner;

public class TwoDemensionFor {

	public static void main(String[] args) {
		// TODO 반복문을 사용해 2차원 배열의 값을 입력하시오.
		
		Scanner in = new Scanner(System.in);
		
		int[][] num = new int[4][5];
		
		for(int i=0; i<num[4][5]; i++) {
			for(int j=0; j<num[i][j];j++) {
				num[i][j] = in.nextInt();
			}
		}
		
		for (int[] a : num) {
			for (int b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}

	}

}
