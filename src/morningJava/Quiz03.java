package morningJava;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		System.out.println("�ش� ���� ���� �ܾ �Է��Ͻÿ�");
		System.out.println("ù ���ڴ� �빮��, �������� �ҹ��ڷ� �Է��ϼ���.");

		int last = -1;
		int mon;
		int regame;
		do {
			do {
				mon = (int) (Math.random() * 12);

			} while (last == mon);
			last = mon;

			while (true) {
				System.out.print(mon + 1 + "�� : ");
				String st = in.next();

				if (st.equals(month[mon]))
					break;
				else
					System.out.println("Ʋ�Ƚ��ϴ�.");
			}

			System.out.println("�����Դϴ�. �ٽ� �ѹ�? 1...Yes/0...No : ");

			regame = in.nextInt();

		} while (regame == 1);
	}

}
