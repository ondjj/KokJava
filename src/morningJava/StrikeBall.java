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
			System.out.println(randomCount + "������ �ߺ����� �ʴ� ���� ��: " + Arrays.toString(num));

			System.out.print(cnt + "ȸ :" + num[0] + " " + num[1] + " " + num[2]);
			
			System.out.println();
			
			System.out.print("3���� ������ �Է��ϼ��� (1~9) \n");
			
			System.out.println("�����̽��� �����Ͻð� �������� Enter�� �����ּ���");
			
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
				System.out.println("�ƿ��Դϴ�");
			} else
				ball++;

			iteration++;

			System.out.println(strike + "��Ʈ����ũ," + ball + "��");
			
			if (strike == 3 || strike > 3) {
				
				System.out.println("3��Ʈ����ũ ��������");
				
				System.out.println(iteration + "������ ���߼̽��ϴ�.");
				
				System.out.println("�� ���� �� �Ͻðڽ��ϱ�?(0:����,1:�����)");
				
				int choice = in.nextInt();
				
				if (choice == 0) {
					
					System.out.println("== ������ ����Ǿ����ϴ�. ==");
					
					flag = false;
					
				} else {
					
					System.out.println("== ������ ������մϴ�.==");
					
					cnt++;
					
					flag = true;
				}
			}

		}

	}

}
