package afternoonJava;

import java.util.Calendar;

public class EnumType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Week today = null;

		Calendar current = Calendar.getInstance();

		int year = current.get(Calendar.YEAR);
		int month = current.get(Calendar.MONTH);
		int day = current.get(Calendar.DATE);
		int week = current.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month + 1);
		System.out.println(day);
		System.out.println(week);

		switch (week) {
		case 1: {
			today = Week.SUNDAY;
			System.out.println("������ �Ͽ���");
			break;
		}
		case 2: {
			today = Week.MONDAY;
			System.out.println("������ ������");
			break;
		}
		case 3: {
			today = Week.TUESDAY;
			System.out.println("������ ȭ����");
			break;
		}
		case 4: {
			today = Week.WEDNESDAY;
			System.out.println("������ ������");
			break;
		}
		case 5: {
			today = Week.THURSDAY;
			System.out.println("������ �����");
			break;
		}
		case 6: {
			today = Week.FRIDAY;
			System.out.println("������ �ݿ���");
			break;
		}
		default:

			System.out.println("������ �����");
			break;
		}
		System.out.println(today);
	}

}
