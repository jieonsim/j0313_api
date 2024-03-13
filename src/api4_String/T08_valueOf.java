package api4_String;

import java.util.*;

public class T08_valueOf {
	public static void main(String[] args) {
		// String.valueOf() : ~ 자료형들을 '문자열'로 반환한다
		
//		int intSu = 1234;
//		double dblSu = 1234.0;
		// 일반 타입이 아닌 객체 타입으로 변경. 객체여야지만 타입 확인 가능
 		Integer intSu = 1234;
 		Double dblSU = 1234.0;
		String strSu = "1234";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// HashMap<String, Integer> : 제너릭
		
		System.out.println(strSu);
		System.out.println(strSu.getClass().getName());
		System.out.println(intSu.getClass().getName());
		System.out.println(dblSU.getClass().getName());
		System.out.println(map.getClass().getName());
		
		int intSu2 = 1234;
		System.out.println("1. intSu + 100 = " + (intSu + 100));
//		String strSu2 = (String) intSu2;		불가
//		String strSu2 = intSu2.toString();		불가
		String strSu2 = intSu + "";
		strSu2 = intSu2 + "";
		
		String strSu3 = String.valueOf(intSu2);	// 문자 타입으로 강제 형변환
		System.out.println(strSu3.getClass().getName());
		
		double dblSu4 = 3.14;
		String strSu4 = String.valueOf(dblSu4);	// 문자 타입으로 강제 형변환
		System.out.println(strSu4.getClass().getName());
		System.out.println();
		
		int a1 = 100;
		int a2 = 200;
		int res = a1 + a2;
		System.out.println("res : " + res);
		
		String str5 = String.valueOf(a1) + String.valueOf(a2);
		System.out.println(str5); // 출력결과 : 100200 | 300이 아니라 문자열 그대로 더해져 100200으로 나옴
		
//		int res6 = (int) (String.valueOf(a1)) + (int) (String.valueOf(a2));		불가
		int res6 = Integer.parseInt(String.valueOf(a1)) + Integer.parseInt(String.valueOf(a2));
		System.out.println("res6 : " + res6); // 출력결과 : 300
		
		// valueOf 는 문자열로 바꿔줌 그 문자열을 다시 숫자타입으로 하려면 형변환이 아니라 객체 타입인 wrapper class (Integer)를 써야함
		
		
		
		
		
		
		
		
		
	}
}
