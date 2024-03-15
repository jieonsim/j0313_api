package api_date_exam;

import java.time.LocalDate;
import java.util.Scanner;

public class Date_Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate now = LocalDate.now();
		Service service = new Service();
		String[][] members = {
				{"홍길동", "2000-1-1"},
				{"김말숙", "2020-12-31"},
				{"이기자", "2019-5-20"},
				{"소나무", "2024-3-14"},
				{"아톰맨", "2022-11-22"},
				{"에이맨", "2023-12-11"},
				{"오하늘", "2024-3-14"},
				{"최고봉", "2021-3-14"},
				{"으뜸맨", "2023-5-2"},
				{"사랑이", "2024-3-13"},
				{"감나무", "2022-10-10"},
				{"행복맨", "2000-12-12"},
				{"가나다", "2024-2-28"},
				{"오솔길", "2024-3-15"}
		};
		boolean run = true;
		int choice;
		
		while(run) {
			System.out.println("\n==============================================================");
			System.out.println("** 다음 작업을 선택하세요 **(오늘날짜:"+now+")");
			System.out.println("==============================================================");
			System.out.print("1.전체회원 2.일년이상된회원 3.한달이내 등록한회원 4.오늘등록한회원, 0:종료 ==> ");
			choice = sc.nextInt();
			System.out.println("--------------------------------------------------------------");
			
			switch(choice) {
				case 1:
					service.memberList(members);
					break;
				case 2:
					service.oneYearList(members);
					break;
				case 3:
					service.oneMonthList(members);
					break;
				case 4:
					service.todayList(members);
					break;
				default:
					run = false;
			}
		}
		System.out.println("작업끝... 감사합니다.");
		sc.close();
	}
}
