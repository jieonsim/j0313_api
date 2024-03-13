package api2_System;

public class Test2 {
	public static void main(String[] args) {
		int i, tot = 0;
		
		for (i = 1; i <= 100000000; i++) {
			tot += i;
			if (tot >= 10000) {
				System.out.println("합이 10000 이상일 때 i값 : " + i);
				// break;
				return; // 리턴 쓰면 메인 메소드 무시하고 아예 종료 
			}
		}
		System.out.println("작업 끝");
	}
}
