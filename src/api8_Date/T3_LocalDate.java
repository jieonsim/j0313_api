package api8_Date;

import java.time.*;
import java.time.format.*;

public class T3_LocalDate {
	public static void main(String[] args) {
		// 싱글톤은 아니지만 정적 멤버로 되어있어 객체 생성할 필요 없음
		// LocalDate 객체
		LocalDate currentDate = LocalDate.now();
		System.out.println("오늘 날짜 : " + currentDate);

		// 날짜 지정 셋팅
		currentDate = LocalDate.of(2024, 12, 25);
		System.out.println("지정 날짜 : " + currentDate);

		// 시스템의 현재 시간 정보 가져오기
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시각 : " + currentTime); // 밀리세컨까지 출력됨
		System.out.println("현재 시각 : " + currentTime.toString().substring(0, 8));
		// 숫자인 시간을 문자열로 변환(toString)한 다음에 substring으로 추출

		// 시간 지정 셋팅
		LocalTime targetTime = LocalTime.of(12, 50, 30);
		System.out.println("설정 시간 : " + targetTime);

		// 날짜 시간
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("설정 시간 : " + currentDateTime);

		String[] strToday = currentDateTime.toString().split("T"); // split 이용한 구분
		System.out.println("오늘 날짜 : " + strToday[0]);
		System.out.println("오늘 시간 : " + strToday[1].substring(0, 8));

		// 날짜 / 시간 지정 셋팅
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 3, 14, 13, 5, 10);
		System.out.println("설정 날짜 / 시간 : " + targetDateTime);
		System.out.println();

		// 날짜 연산하기 -> 중요!
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		System.out.println("현재 날짜/시간 : " + now.format(dtf));

		LocalDateTime res = now.plusYears(1);
		System.out.println("오늘 날짜에 1년 더하기 : " + res.toString().substring(0, 4) + "년");

		res = now.minusYears(1);
		System.out.println("오늘 날짜에 1년 빼기 : " + res.toString().substring(0, 4) + "년");

		res = now.plusMonths(2);
		System.out.println("오늘 날짜에 2월 더하기 : " + res.toString().substring(5, 7) + "월");

		res = now.minusMonths(2);
		System.out.println("오늘 날짜에 2월 빼기 : " + res.toString().substring(5, 7) + "월");

		res = now.plusDays(7);
		System.out.println("오늘 날짜에 7일 더하기 : " + res.toString().substring(8, 10) + "월");

		res = now.minusDays(7);
		System.out.println("오늘 날짜에 7일 빼기 : " + res.toString().substring(8, 10) + "월");
		System.out.println();
		
	}
}
