package afternoonJava;

import java.util.Calendar;

public class Season_cl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		Season season = null;

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);

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

		switch (month) {

		case 12, 1, 2:
			season = Season.WINTER;
			break;

		case 3, 4, 5:
			season = Season.SPRING;
			break;

		case 6, 7, 8:
			season = Season.SUMMER;
			break;

		case 9, 10, 11:
			season = Season.WINTER;
			break;
		}
		System.out.println(
				"오늘의 날짜는 " + year + "년 " + month + "월 " + day + "일 " + today + "요일" + " 지금 계절은 " + season + " 입니다.");
	}

}
