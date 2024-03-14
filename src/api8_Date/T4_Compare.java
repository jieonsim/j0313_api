package api8_Date;

/*
 	프로젝트에 날짜 어떻게 했다는거 한장 넣는 거 좋음
 */
import java.time.*;
import java.time.format.*;

public class T4_Compare {
	public static void main(String[] args) {
		// 날짜 시간 비교(주의 : 시간 비교 시는 ns(나노초)까지 비교된다)
		LocalDateTime startDateTime = LocalDateTime.now();
		System.out.println("오늘(현재) 날짜 / 시간 : " + startDateTime);
		System.out.println();

		// 나노초 뺀 걸로 하나 구하고 계산하는게 낫다
		String tempToday = startDateTime.toString();
		String strToday = tempToday.substring(0, tempToday.indexOf(".")); // 0에서부터 .의 주소 앞까지
		System.out.println("오늘(현재) 날짜 / 시간 : " + strToday);

		// 날짜와 시간 구분하기(T 문자를 기준으로 split() 메소드 이용하여 자르기)
		String strDate = strToday.split("T")[0]; // 0번방에 들어가있는 날짜 구분
		String strTime = strToday.split("T")[1]; // 1번방에 들어가있는 시간 구분

		System.out.println("오늘 날짜 : " + strDate);
		System.out.println("오늘 시간 : " + strTime);
		System.out.println("===============================");

		// 비교할 날자 / 시간
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 1, 14, 14, 30, 20);
		System.out.println("타켓(비교) 날짜 / 시간 : " + targetDateTime);
		System.out.println();

		String StrTargetToday = targetDateTime.toString();
		System.out.println("타켓(비교) 날짜 / 시간 : " + StrTargetToday);

		// 날짜와 시간 구분하기(T 문자를 기준으로 split() 메소드 이용하여 자르기)
		String compareDate = StrTargetToday.split("T")[0]; // 0번방에 들어가있는 날짜 구분
		String comparetime = StrTargetToday.split("T")[1]; // 1번방에 들어가있는 시간 구분

		System.out.println("비교 날짜 : " + compareDate);
		System.out.println("비교 시간 : " + comparetime);
		System.out.println("================================");

		if (strDate.equals(compareDate)) {
			System.out.println("같은 날");
		} else {
			System.out.println("다른 날");
		}

		// 날짜를 날짜 형식으로 비교하고자 한다면?
		// isEqual() : 동일 날짜 비교, 이전 날짜 비교 : isBefore(), 이후 날짜 비교 : isAfter()
		// Period : 날짜 차이 비교 (Period는 메소드가 아닌 클래스다(명령어))

		System.out.println("isEqual() : " + startDateTime.isEqual(targetDateTime)); // 오늘이랑 타겟날짜랑 같니?
		System.out.println("isBefore() : " + startDateTime.isBefore(targetDateTime)); // 오늘이 타겟 날짜보다 이전이니?
		System.out.println("isAfter() : " + startDateTime.isAfter(targetDateTime)); // 오늘이 타겟 날짜보다 이후니?

		// 날짜 차이 계산 (Period 클래스)
		LocalDate startDate = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2024, 1, 14);
		Period period = Period.between(startDate, targetDate);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		System.out.println();
		
		// 해당 월의 마지막 날짜 찾기 (달력 만들기 때 써먹기) : (___.atEndOfMonth())
		String lastDay = "2024-03-01";
//		LocalDate compareDate2 = LocalDate.parse(lastDay, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//		System.out.println(lastDay + "달의 마지막 일자 : " + YearMonth.from(compareDate2).atEndOfMonth());
		
		System.out.println(lastDay + "달의 마지막 일자 : " + YearMonth.from(LocalDate.parse(lastDay, DateTimeFormatter.ofPattern("yyyy-MM-dd"))).atEndOfMonth());
		// 나중에 써먹어야지..
		
		String lastDay2 = "24-9-2";
		System.out.println(lastDay2 + "달의 마지막 일자 : " + YearMonth.from(LocalDate.parse(lastDay2, DateTimeFormatter.ofPattern("yy-M-d"))).atEndOfMonth());
		
		
		
		

	}
}
