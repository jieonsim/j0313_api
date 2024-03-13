package api4_String;

import java.util.*;

public class T09_compareTo {
	public static void main(String[] args) {
		String str = "Seoul";
		str += "/Busan";
		str += "/Cheongju";
		
		System.out.println("str : " + str);
		System.out.println();
		
		String a = "Seoul";
		String b = "seoul";
		String c = a + b;		// c = Seoulseoul
		System.out.println("c : " + c);
		System.out.println();
		
		// compareTo() : 문자열 비교 메소드 (0: 동일자료, 음수값: 앞의 문자열이 뒤의 문자열보다 작다., 양수값: 앞의 문자열이 뒤의 문자열보다 크다.) 
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(c.compareTo(a));
		System.out.println();
		
		// 공백 비교 : equals(), isBlank(), isEmpty()
		System.out.println("1. C가 공백 ? " + c.equals(""));
		System.out.println("2. C가 공백 ? " + c.equals(" "));		
		System.out.println("3. C가 공백 ? " + c.isBlank());
		System.out.println("4. C가 공백 ? " + c.isEmpty());
		System.out.println();
		
		String d = "";
		System.out.println("5. d가 공백 ? " + d.equals(""));
		System.out.println("6. d가 공백 ? " + d.equals(" "));		
		System.out.println("7. d가 공백 ? " + d.isBlank());
		System.out.println("8. d가 공백 ? " + d.isEmpty());
		System.out.println("9. d가 null ? " + Objects.isNull(d));
		
		
		
		
	}
}
