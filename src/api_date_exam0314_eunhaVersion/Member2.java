package api_date_exam0314_eunhaVersion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

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

(문제2) 문제1에서 주어진 내용을 임의의 날짜를 입력받아서 처리할 수 있도록 한다.
단, 입력날짜보다 이후에 등록된 회원은 '가입승인 대기중'이라고 출력한다.

*/
public class Member2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] memberList = 
			{
					{ "홍길동", "2000-01-01 11:10:30" },
					{ "김말숙", "2020-12-31 11:10:30" },
					{ "이기자", "2019-05-20 11:10:30" },
					{ "소나무", "2024-03-17 11:10:30" },
					{ "아톰맨", "2022-11-22 11:10:30" },
					{ "에이맨", "2023-12-11 11:10:30" },
					{ "오하늘", "2024-03-14 11:10:30" },
					{ "최고봉", "2021-03-14 11:10:30" },
					{ "으뜸맨", "2023-05-02 11:10:30" }, 
					{ "사랑이", "2024-03-16 11:10:30" }, 
					{ "감나무", "2022-10-10 11:10:30" },
					{ "행복맨", "2000-12-12 11:10:30" },
					{ "가나다", "2024-02-28 11:10:30" }, 
					{ "오솔길", "2024-03-01 11:10:30" }, 	
			};
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("마지막 회원 관리 작업일자를 입력하세요(예. 2024-03-01 10:10:30) : ");
		LocalDateTime lastWorkDay = LocalDateTime.parse(scanner.nextLine(), dtf);
		long secTime;
		for(int i = 0; i < memberList.length; i++) {
			LocalDateTime memberDate = LocalDateTime.parse(memberList[i][1], dtf);
			secTime = memberDate.until(lastWorkDay, ChronoUnit.SECONDS);
			if (secTime < 0) {
				System.out.println("==> " + memberList[i][0] + "님은 '가입 승인 대기 중' 입니다.");
			}
		}
		scanner.close();
	}
}
