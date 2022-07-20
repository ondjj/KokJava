package morningJava;

import java.util.Arrays;
import java.util.Scanner;

public class StrikeBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = true;
		Scanner in = new Scanner(System.in);
		int[] num = new int[3];
		int[] answer = new int[3];
		int cnt = 1;
		int strike = 0;
		int ball = 0;
		int iteration = 0;

		int randomCount = 0;

		outer: while (flag) {

			randomCount++;
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 9) + 1;
			}
			if (((num[0] == num[1]) || (num[1] == num[2]) || (num[2] == num[0]))) {

				continue outer;
			}
			System.out.println(randomCount + "번만에 중복되지 않는 랜덤 수: " + Arrays.toString(num));

			System.out.print(cnt + "회 :" + num[0] + " " + num[1] + " " + num[2]);
			
			System.out.println();
			
			System.out.print("3개의 정수를 입력하세요 (1~9) \n");
			
			System.out.println("스페이스로 구분하시고 마지막에 Enter를 눌러주세요");
			
			strike = 0;
			
			answer[0] = in.nextInt();
			answer[1] = in.nextInt();
			answer[2] = in.nextInt();

			if ((answer[0] == num[0]) && (answer[1] == num[1]) && (answer[2] == num[2])) {
				strike += 3;

			} else if ((answer[0] == num[0]) && (answer[1] == num[1]) || (answer[0] == num[0]) && (answer[2] == num[2])
					|| (answer[1] == num[1]) && (answer[2] == num[2])) {
				strike += 2;

			} else if (answer[0] == num[0] || answer[1] == num[1] || answer[2] == num[2]) {
				strike += 1;

			} else if (answer[0] != num[0] && answer[1] != num[1] && answer[2] != num[2]) {
				System.out.println("아웃입니다");
			} else
				ball++;

			iteration++;

			System.out.println(strike + "스트라이크," + ball + "볼");
			
			if (strike == 3 || strike > 3) {
				
				System.out.println("3스트라이크 게임종료");
				
				System.out.println(iteration + "번만에 맞추셨습니다.");
				
				System.out.println("한 게임 더 하시겠습니까?(0:종료,1:재시작)");
				
				int choice = in.nextInt();
				
				if (choice == 0) {
					
					System.out.println("== 게임이 종료되었습니다. ==");
					
					flag = false;
					
				} else {
					
					System.out.println("== 게임을 재시작합니다.==");
					
					cnt++;
					
					flag = true;
				}
			}

		}

	}

}
