package study.prob06;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("1.가위 || 2.바위 || 3.보");
		System.out.print(">>> 선택 : ");
		System.out.println("(다른 수를 입력하면 종료)");

		do {
			int rps = scanner.nextInt();
			int mcRps = (int) (Math.random() * 3) + 1;

			if (rps == mcRps) {
				System.out.println("무승부입니다.");
			} else if ((rps == 1) && (mcRps == 2)) {
				System.out.println(">>> 유저 -> '가위' 컴퓨터 -> '바위' 컴퓨터가 이겼습니다.");
			} else if ((rps == 3) && (mcRps == 1)) {
				System.out.println(">>> 유저 -> '보' 컴퓨터 -> '가위' 컴퓨터가 이겼습니다.");
			} else if ((rps == 2) && (mcRps == 3)) {
				System.out.println(">>> 유저 -> '바위' 컴퓨터 -> '보' 컴퓨터가 이겼습니다.");
			} else if ((rps == 2) && (mcRps == 1)) {
				System.out.println(">>> 유저 -> '바위' 컴퓨터 -> '가위' 유저가 이겼습니다.");
			} else if ((rps == 1) && (mcRps == 3)) {
				System.out.println(">>> 유저 -> '가위' 컴퓨터 -> '보' 유저가 이겼습니다.");
			} else if ((rps == 3) && (mcRps == 2)) {
				System.out.println(">>> 유저 -> '보' 컴퓨터 -> '바위' 유저가 이겼습니다.");
			}
			else {
				System.out.println("게임을 종료합니다.");
				break;
			}
		} while (true);

	}

}
