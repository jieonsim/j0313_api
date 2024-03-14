package api8_Date;

import java.time.*;
import java.time.temporal.*;

public class T4_DateCompare {
	public static void main(String[] args) {

		LocalDateTime startDateTime = LocalDateTime.now();
		LocalDateTime endDateTime = LocalDateTime.of(2024, 12, 31, 0, 0, 0);
		
		System.out.println("남은 년도 : " + startDateTime.until(endDateTime, ChronoUnit.YEARS));
		System.out.println("남은 개월 : " + startDateTime.until(endDateTime, ChronoUnit.MONTHS));
		System.out.println("남은 날짜 : " + startDateTime.until(endDateTime, ChronoUnit.DAYS));
		System.out.println("남은 시간 : " + startDateTime.until(endDateTime, ChronoUnit.HOURS));
		System.out.println("남은 분 : " + startDateTime.until(endDateTime, ChronoUnit.MINUTES));
		System.out.println("남은 초 : " + startDateTime.until(endDateTime, ChronoUnit.SECONDS));
		
	}
}
