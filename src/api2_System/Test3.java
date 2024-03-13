package api2_System;

public class Test3 {
	public static void main(String[] args) {
		int i, tot = 0;
		
		for (i = 1; i <= 100000000; i++) {
			tot += i;
			if (tot >= 10000) {
				System.out.println("합이 10000 이상일 때 i값 : " + i);
				// break;
				// return;
				System.exit(0); // 0 = 시스템 종료 (리턴과 동일한 기능)
			}
		}
		System.out.println("작업 끝");
	}
}
