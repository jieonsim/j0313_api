package api8_Date;

import java.util.*;

public class T2_Calendar {
	public static void main(String[] args) {
//		Calendar cal = new Calendar(); (불가, 싱글톤 패턴으로 해야 함)
		// getInstance로 부르는 애들은 거의 싱글톤이다

		Calendar cal = Calendar.getInstance();
		System.out.println("년도 : " + cal.get(Calendar.YEAR)); // 열거형은 필드 값 안에 클래스이름. 으로 불러야함
		System.out.println("월 : " + (cal.get(Calendar.MONTH) + 1)); // 월은 0부터 시작하기 때문에 뒤에 1을 붙여야함!
		System.out.println("일 : " + cal.get(Calendar.DATE));
		System.out.println("시 : " + cal.get(Calendar.HOUR_OF_DAY)); // 오늘의 지금 시간
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("오늘이 몇번째 주 : " + cal.get(Calendar.WEEK_OF_YEAR)); // 1/1부터 오늘까지 몇번째 주가 지났는지
		System.out.println("오늘이 몇번째 일 : " + cal.get(Calendar.DAY_OF_WEEK)); // 한주를 기준으로 오늘이 몇번일이 지났는지
		// DAY_OF_WEEK 는 일요일이 한 주의 시작, 일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)
		System.out.println(cal.get(Calendar.AM_PM)); // AM : 0, PM : 1

		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		System.out.println("지금은 " + strAmPm + " 입니다.");

		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strWeek = "";
		switch (week) { // 위 아래 두가지 방법으로 가능
			case 1:
				strWeek = "일";
				break;
			case 2:
				strWeek = "월";
				break;
			case 3:
				strWeek = "화";
				break;
			case 4:
				strWeek = "수";
				break;
			case 5:
				strWeek = "목";
				break;
			case 6:
				strWeek = "금";
				break;
			case 7:
				strWeek = "토";
				break;
//				switch (week) {
//					case Calendar.SUNDAY:
//						strWeek = "일";
//						break;
//					case Calendar.MONDAY:
//						strWeek = "월";
//						break;
//					case Calendar.TUESDAY:
//						strWeek = "화";
//						break;
//					case Calendar.WEDNESDAY:
//						strWeek = "수";
//						break;
//					case Calendar.THURSDAY:
//						strWeek = "목";
//						break;
//					case Calendar.FRIDAY:
//						strWeek = "금";
//						break;
//					case Calendar.SATURDAY:
//						strWeek = "토";
//						break;
		}
		System.out.println("오늘은 " + strWeek + "요일 입니다.");
	}
}
