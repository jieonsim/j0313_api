package api_exam0313;

import java.util.*;

public class Example2_TeacherVersion2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String temp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
		int cnt = 0;

		while (true) {
			int sw = 0;
			cnt++;
			System.out.print("아이디를 입력하세요? ");
			String mid = scanner.next();

			if (mid.length() < 4 || mid.length() > 20)
				sw = 1;
			else {
				for (int i = 0; i < mid.length(); i++) {
					if (!temp.contains(String.valueOf(mid.charAt(i)))) { // String.valueOf : 들어있는 값을 문자열로 변환
						// contains는 문자가 아닌 문자열이 포함되어있는지 확인함, 그렇기 때문에 char 타입 값을 String.valueOf 로 문자열로 변환 필요
						sw = 1;
						break;
					}
				}
			}
			if (sw == 1) {
				System.out.println("입력된 아이디는 사용하실수 없습니다.");
				if (cnt == 3)
					cnt = delayCheck();
			} else {
				System.out.println(mid + " 님 환영합니다.");
				break;
			}
		}
		scanner.close();
	}

	private static int delayCheck() {
		System.out.println("================================");
		System.out.println("로그인 3번 실패로 10초간 작업이 중지됩니다.");
		for (int i = 10; i > 0; i--) {
			System.out.print("." + i + ".");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("\n다시 로그인해 보세요. 기회는 3번입니다.");
		System.out.println("================================");
		return 0;
	}
}
