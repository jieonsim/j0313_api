package api_exam;

import java.util.*;

public class Example2_TeacherVersion1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 입력받는 아이디는 영문자와 숫자와 밑줄(_)만을 허용할 수 있도록 처리하시오.
		String temp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
		int cnt = 0;

		while (true) {
			cnt++; // 처음부터 카운트 시작
			System.out.print("아이디를 입력하세요? ");
			String mid = scanner.next();

			if (mid.length() < 4 || mid.length() > 20) {
				System.out.println("아이디는 4~20자 이내로 작성하세요.");
				if (cnt == 3)
					cnt = delayCheck(); // 딜레이체크 메소드 이용
				continue;
			}

			int sw = 0;
			for (int i = 0; i < mid.length(); i++) {
				sw = 0;
				for (int j = 0; j < temp.length(); j++) {
					if (mid.charAt(i) == temp.charAt(j)) {
						sw = 1;
						break;
					}
				}
				if (sw == 0)
					break;
			}
			if (sw == 0) {
				System.out.println("입력된 아이디는 사용하실수 없습니다.");
				if (cnt == 3) {
					cnt = delayCheck();
					continue;
				}
			} else {
				System.out.println(mid + " 님 환영합니다.");
				break;
			}
		}
		scanner.close();
	}

	private static int delayCheck() {
		System.out.println("로그인 3번 실패로 10초간 작업이 중지됩니다.");
		for (int i = 10; i > 0; i--) {
			System.out.print("." + i + ".");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("\n다시 로그인해 보세요. 기회는 3번입니다.");
		return 0;
	}
}
