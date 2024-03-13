package api_exam;

import java.util.*;

/*
콘솔을 통해서 아이디를 입력받는다.
단, 아이디는 영문대문자,영문소문자,숫자와 특수문자는 '_'을 사용할 수 있고,
길이는 4~20자 이내로 입력받을수 있도록 처리한다.
단, 기회는 3번으로 처리후 3번안에 처리못하면 작업을 20초간 종료시키게 한다.
예) 아이디를 입력하세요? abc
   ==> 입력된 아이디 abc는 사용하실수 없습니다.
   계속할까요?(y/n)  Y
   -----------------------------------
   아이디를 입력하세요? abc!
   ==> 입력된 아이디 abc!는 사용하실수 없습니다.
   계속할까요?(y/n)  Y
   -----------------------------------
   아이디를 입력하세요? abcdefghijklmnopqrstuvwzyz
   ==> 입력된 아이디 abcdefghijklmnopqrstuvwzyz는 사용하실수 없습니다.
   20초가 사용이 제한됩니다.
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~(20초간 기다림.....)
   
   아이디를 입력하세요? atom1234!
   ==> 입력된 아이디 atom1234!는 사용하실수 없습니다.
   계속할까요?(y/n)  Y
   -----------------------------------
   아이디를 입력하세요? atom1234
   ==> 입력된 아이디 는 사용하실수 없습니다.
   atom1234 로그인 되었습니다.
*/

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String id = scanner.next();
		if (id.equals("_")) {
			System.out.println("입력된 아이디 " + id + "는 사용하실 수 없습니다.");
		}
		System.out.println();
		scanner.close();
	}
}
