package study.quiz01;

import java.util.Scanner;

public class NameSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		String[] name = new String[n];

		for (int i = 0; i < n; i++) {

			System.out.print("��� �Է� >>> ");

			name[i] = in.nextLine();
		}

		for (int i = 0; i < n; i++) {

			System.out.print("�˻��� �̸��� �Է� >>> ");
			String search = in.nextLine();

			if (name[i].equals(search)) {
				System.out.printf("%s���� %d��° �ε����� ����Ǿ��ֽ��ϴ�. \n", search, i);
				break;
			} else {
				System.out.println("��Ͽ� ���� �̸��Դϴ�.");
			}
		}
		in.close();

	}

}
