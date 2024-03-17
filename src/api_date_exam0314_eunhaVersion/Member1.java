package api_date_exam0314_eunhaVersion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
 	========================
	회원명 회원가입일자
	========================
	홍길동 2000-1-1
	김말숙 2020-12-31
	이기자 2019-5-20
	소나무 2024-3-17
	아톰맨 2022-11-22
	에이맨 2023-12-11
	오하늘 2024-3-14
	최고봉 2021-3-14
	으뜸맨 2023-5-2
	사랑이 2024-3-16
	감나무 2022-10-10
	행복맨 2000-12-12
	가나다 2024-2-28
	오솔길 2024-3-1
========================

(문제1)앞의 자료는 회원들의 등록일을 기억하고 있다.(모두 오늘 날짜를 기준으로 처리한다.)
1. 등록된 회원들이 1년이상된 회원들의 명단출력?(단, 지금부터 몇개월이 지났는지와 함께 출력)
2. 최근 1달안에 등록된 회원들의 명단과 경과된 일수를 함께 출력?
3. 오늘 등록한 회원들의 명단과 경과된 시간을 함께 출력?

 */
public class Member1 {
	public static void main(String[] args) {

		String[][] memberList = 
			{ 
				{ "홍길동", "2000-01-01" }, 
				{ "김말숙", "2020-12-31" }, 
				{ "이기자", "2019-05-20" },
				{ "소나무", "2024-03-17" }, 
				{ "아톰맨", "2022-11-22" }, 
				{ "에이맨", "2023-12-11" }, 
				{ "오하늘", "2024-03-14" },
				{ "최고봉", "2021-03-14" }, 
				{ "으뜸맨", "2023-05-02" }, 
				{ "사랑이", "2024-03-16" }, 
				{ "감나무", "2022-10-10" },
				{ "행복맨", "2000-12-12" }, 
				{ "가나다", "2024-02-28" }, 
				{ "오솔길", "2024-03-01" }, 
			};

		LocalDate localDate = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		System.out.println("1. 가입일로부터 1년 이상된 회원들의 명단");
		long month;
		for (int i = 0; i < memberList.length; i++) {
			LocalDate memberDate = LocalDate.parse(memberList[i][1], dtf);
			month = memberDate.until(localDate, ChronoUnit.MONTHS);
			if (month >= 12) {
				System.out.println("==>" + memberList[i][0] + "님은 가입한 지 " + month + "개월 지났습니다.");
			}
		}
		System.out.println();

		System.out.println("2. 최근 한 달안에 가입된 회원들의 명단과 가입일로부터 경과된 일 수");
		long day;
		for (int i = 0; i < memberList.length; i++) {
			LocalDate memberDate = LocalDate.parse(memberList[i][1], dtf);
			day = memberDate.until(localDate, ChronoUnit.DAYS);
			if (day <= 30) {
				System.out.println("==> " + memberList[i][0] + "님은 가입한 지 " + day + "일 되었습니다.");
			}
		}
		System.out.println();

		System.out.println("3. 오늘 가입된 회원의 명단");
		for (int i = 0; i < memberList.length; i++) {
			LocalDate memberDate = LocalDate.parse(memberList[i][1], dtf);
			if (memberDate.isEqual(localDate)) {
				System.out.println("==> " + memberList[i][0] + "님은 오늘 가입하셨습니다.");
			}
		}
	}
}
