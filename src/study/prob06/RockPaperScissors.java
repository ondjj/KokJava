package study.prob06;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("1.���� || 2.���� || 3.��");
		System.out.print(">>> ���� : ");
		System.out.println("(�ٸ� ���� �Է��ϸ� ����)");

		do {
			int rps = scanner.nextInt();
			int mcRps = (int) (Math.random() * 3) + 1;

			if (rps == mcRps) {
				System.out.println("���º��Դϴ�.");
			} else if ((rps == 1) && (mcRps == 2)) {
				System.out.println(">>> ���� -> '����' ��ǻ�� -> '����' ��ǻ�Ͱ� �̰���ϴ�.");
			} else if ((rps == 3) && (mcRps == 1)) {
				System.out.println(">>> ���� -> '��' ��ǻ�� -> '����' ��ǻ�Ͱ� �̰���ϴ�.");
			} else if ((rps == 2) && (mcRps == 3)) {
				System.out.println(">>> ���� -> '����' ��ǻ�� -> '��' ��ǻ�Ͱ� �̰���ϴ�.");
			} else if ((rps == 2) && (mcRps == 1)) {
				System.out.println(">>> ���� -> '����' ��ǻ�� -> '����' ������ �̰���ϴ�.");
			} else if ((rps == 1) && (mcRps == 3)) {
				System.out.println(">>> ���� -> '����' ��ǻ�� -> '��' ������ �̰���ϴ�.");
			} else if ((rps == 3) && (mcRps == 2)) {
				System.out.println(">>> ���� -> '��' ��ǻ�� -> '����' ������ �̰���ϴ�.");
			}
			else {
				System.out.println("������ �����մϴ�.");
				break;
			}
		} while (true);

	}

}
