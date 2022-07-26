package morningJava;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		System.out.println("해당 월의 영어 단어를 입력하시오");
		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");

		int last = -1;
		int mon;
		int regame;
		do {
			do {
				mon = (int) (Math.random() * 12);

			} while (last == mon);
			last = mon;

			while (true) {
				System.out.print(mon + 1 + "월 : ");
				String st = in.next();

				if (st.equals(month[mon]))
					break;
				else
					System.out.println("틀렸습니다.");
			}

			System.out.println("정답입니다. 다시 한번? 1...Yes/0...No : ");

			regame = in.nextInt();

		} while (regame == 1);
	}

}
