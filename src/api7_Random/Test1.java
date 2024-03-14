package api7_Random;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Random random = new Random();

		System.out.println(random.nextInt());
		// 2의 32승의 정수형 난수 발생
		System.out.println(random.nextLong());
		// 2의 64승의 정수형 난수 발생
		System.out.println(random.nextDouble());
		// 실수형 난수 발생
		System.out.println(random.nextFloat());
		// 실수형 난수 발생
		System.out.println(random.nextBoolean());
		// 논리형 난수 발생
		System.out.println();
		System.out.println("0 ~ 9까지의 정수 : " + random.nextInt(10));
		System.out.println("1 ~ 10까지의 정수 : " + (random.nextInt(10) + 1)); // 바깥 괄호 꼭 해줘야함
		System.out.println("5 ~ 10까지의 정수 : " + (random.nextInt(10 + 1 -5) + 5));
		System.out.println("20 ~ 30까지의 정수 : " + (random.nextInt(30 + 1 -20) + 20));
		System.out.println();
		
		// 클래스 안의 매개값으로 난수를 고정시킬 수 있다
		Random random1= new Random(5);
		for (int i = 1; i <= 6; i++) {
			System.out.print((random1.nextInt(45) + 1) + " ");
		}
		System.out.println();
		
		Random random2= new Random(10);
		for (int i = 1; i <= 6; i++) {
			System.out.print((random2.nextInt(45) + 1) + " ");
		}
		System.out.println();
		
		Random random3= new Random();
		for (int i = 1; i <= 6; i++) {
			System.out.print((random3.nextInt(45) + 1) + " ");
		}

	}
}
