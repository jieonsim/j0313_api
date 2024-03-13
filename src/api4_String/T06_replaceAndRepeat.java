package api4_String;

public class T06_replaceAndRepeat {
	public static void main(String[] args) {
//		   0		 1		  2
//		   01234567890123457890
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 방문하신 것을 환영합니다.";

		System.out.println("msg1 : " + msg1);
		System.out.println("msg2 : " + msg2);

		// replace() : 치환 - 특정문자(열)을 지정한 문자(열)로 (모두) 변경한다. 단, 대소문자 구별한다

		System.out.println("1. 'Korea'를 'USA'로 변경하시오 : " + msg1.replace("Korea", "USA"));
		System.out.println("2. '한국'를 '미국'로 변경하시오 : " + msg2.replace("한국", "미국"));
		System.out.println("3. 'o'를 'O'로 변경하시오 : " + msg1.replace("o", "O"));
		System.out.println("4. 'o'를 'O'로 변경하시오 : " + msg1.replaceAll("o", "O"));
		// 검색어에 '정규식'을 사용할 때 replaceAll 사용 | regex : 정규식

		String msg3 = " ! H e l l o ! ";
		System.out.println("msg3 : " + msg3);
		System.out.println("msg1 + msg3 + msg2 : " + msg1 + msg3 + msg2);
		System.out.println("msg1 + msg3 + msg2 : " + msg1 + msg3.trim() + msg2);
		// trim() : 양쪽 공백 제거
		
		// msg3번에 포함된 모든 공백을 삭제 후 msg1+msg3+msg2 출력하시오
		System.out.println("msg1 + msg3 + msg2 : " + msg1 + msg3.trim().replace(" ", "") + msg2); // 위아래 출력 결과 동일. replace 가 모두 변경하는거라서 trim 쓸 필요가 없다
		System.out.println("msg1 + msg3 + msg2 : " + msg1 + msg3.replace(" ", "") + msg2);
		// replace 처음에는 " " 공백을 주고 두번째에는 "" 공백없이
		// . 으로 명령어 이어 쓰는게 체인 기법
		
		// msg3 안에는 'hello' 문자열을 포함하고 있는가? (contains() - 대소문자 구별)
		String msg4 = "hello";
		System.out.println(msg3.replace(" ", "").toLowerCase().indexOf(msg4)); // Hello의 H를 소문자 hello로 변환한뒤 그 단어가 있는지 : 출력 1
		System.out.println(msg3.replace(" ", "").toLowerCase().contains(msg4)); // Hell의 H를 소문자 hello로 변환한뒤 그 단어가 있는지 : 출력 true
		System.out.println(msg3.replace(" ", "").contains(msg4)); // Hell의 H 그대로 포함하는지 확인. 출력 : false (대소문자를 구분한다는 의미)
		
		
		// 지정한 문자(열)을 반복 처리 : repeat(); - 자바10 이상부터 가능
		System.out.println(msg3.repeat(3));
		System.out.println("=".repeat(30));
		
		
		
		
		
	}
}
