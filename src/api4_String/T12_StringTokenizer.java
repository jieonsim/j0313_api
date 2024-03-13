package api4_String;

import java.util.*;

public class T12_StringTokenizer {
	public static void main(String[] args) {
		// StringTokenizer : 문자열을 특정 문자(열)로 분리시킨 후 분리된 각각의 토큰(항목)을 내부반복자(이터레이터)로 호출시켜준다
		

		String tel = "010-1234-5678";
		
		StringTokenizer telArr = new StringTokenizer(tel, "-");
		
		System.out.println("telArr 토큰의 개수 : " + telArr.countTokens()); // 출력 결과 : 3
		// for문이랑 짝궁
		
		
		// 토큰 개수를 모르면 while
		String str = "";
		while (telArr.hasMoreElements()) {
			str += telArr.nextToken() + " / ";
		}
		System.out.println("str : " + str.substring(0, str.length() - 2)); // str.length() - 2는 가장 뒤에 / " 를 생략하는 것
		
	}
}
