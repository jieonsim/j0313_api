package api2_System;

// 시험문제라네요,,
public class Test4 {
	public static void main(String[] args) {
		int tot = 0;
		
		long startTime = System.nanoTime();
		
		for (int i = 1; i <= 100000000; i++) {
			tot += i;
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("작업의 소모된 시간 : " + (endTime - startTime));
		System.out.println("작업 끝");
	}
}
