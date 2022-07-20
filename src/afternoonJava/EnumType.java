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
			System.out.println("오늘은 일요일");
			break;
		}
		case 2: {
			today = Week.MONDAY;
			System.out.println("오늘은 월요일");
			break;
		}
		case 3: {
			today = Week.TUESDAY;
			System.out.println("오늘은 화요일");
			break;
		}
		case 4: {
			today = Week.WEDNESDAY;
			System.out.println("오늘은 수요일");
			break;
		}
		case 5: {
			today = Week.THURSDAY;
			System.out.println("오늘은 목요일");
			break;
		}
		case 6: {
			today = Week.FRIDAY;
			System.out.println("오늘은 금요일");
			break;
		}
		default:

			System.out.println("오늘은 토요일");
			break;
		}
		System.out.println(today);
	}

}
