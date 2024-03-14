package api10_Pattern;

import java.util.regex.*;

// 문자열 정규식
public class Test4 {
	public static void main(String[] args) {
		String regEx1 = "^[abc]*$"; // a또는 b또는 c문자로 시작하거나 끝나야함. ^[abc]*$ , "^[a|b|c]*$ 둘 다 가능
		
		String str1 = "1234";
		String str2 = "1234ghdk";
		String str3 = "a";
		String str4 = "bc";
		String str5 = "asdf";
		String str6 = "asdf ";
		String str7 = "asDf";
		String str8 = "abc";
		String str9 = "aaa";
		
		System.out.println("1 : " + Pattern.matches(regEx1, str1));
		System.out.println("2 : " + Pattern.matches(regEx1, str2));
		System.out.println("3 : " + Pattern.matches(regEx1, str3));
		System.out.println("4 : " + Pattern.matches(regEx1, str4));
		System.out.println("5 : " + Pattern.matches(regEx1, str5));
		System.out.println("6 : " + Pattern.matches(regEx1, str6));
		System.out.println("7 : " + Pattern.matches(regEx1, str7));
		System.out.println("8 : " + Pattern.matches(regEx1, str8));
		System.out.println("9 : " + Pattern.matches(regEx1, str9));
	}
}
