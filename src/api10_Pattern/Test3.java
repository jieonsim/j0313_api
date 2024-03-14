package api10_Pattern;

import java.util.regex.*;

// 공백 유무 체크 : ^[\\s]*$
public class Test3 {
	public static void main(String[] args) {
		String regEx1 = "^[\\s]*$";
		
		String str1 = "1234";
		String str2 = "12 3 4";
		String str3 = "12!!";
		String str4 = "12		";	// 숫자(문자) + tab키로 공백 추가
		String str5 = "    ";		// spacebar 공백 추가	
		String str6 = "			".trim();	// 전부 tab키로 공백 추가 (trim() 메소드로 먼저 걸러낸다)
		
		System.out.println("1 : " + Pattern.matches(regEx1, str1));
		System.out.println("2 : " + Pattern.matches(regEx1, str2));
		System.out.println("3 : " + Pattern.matches(regEx1, str3));
		System.out.println("4 : " + Pattern.matches(regEx1, str4));	// tab이 포함되어있다면 공백으로 보지 않는다!
		System.out.println("5 : " + Pattern.matches(regEx1, str5));
		System.out.println("6 : " + Pattern.matches(regEx1, str6));
		
		
	}
}
