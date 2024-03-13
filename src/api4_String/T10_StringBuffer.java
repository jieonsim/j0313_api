package api4_String;

/*
	=> mutable(가변) / immutable(불가변)
 	String 객체 : immutable 객체로서 Class로서 한번 크기가 생성된 값을 그 값을 유지하게 된다. 짧은 문자열 처리 적절
 	StringBuffer 객체 : mutable 객체로서 크기를 변경할 수 있다. 동기화 제공, 멀티스레드 제공 및 사용하기 적절. 가변 길이 문자열에 적당
 	StringBuilder 객체 : mutable 객체로서 크기를 변경할 수 있다. 동기화 여부가 불분명, 가변 길이 문자열에 적당
 	성능 : StringBuilder > StringBuffer >>> String / String이 가장 빠름
 	
 	TSS(시분할 방식) time sharing system
 	
 */
public class T10_StringBuffer {
	public static void main(String[] args) {
		String str = new String("홍길동");
		System.out.println("1. str : " + str); // immutable
		
		str += "/홍길동2";
		System.out.println("2. str : " + str); // immutable
		
		// capacity() : 현재 버퍼의 크기를 알아낸다.
//		str.capacity();	불가
		
		// StringBuffer() 객체 : 가변 길이 클래스로서 기본 크기는 16, 자료가 넘치면 상황에 따라서 크기를 변경 처리한다.
		// append : 값 추가, insert : 값 특정 위치에 삽입, delete : 특정 위치의 값을 지정한 개수만큼 삭제 처리, replace : 치환
		StringBuffer str2 = new StringBuffer();
		System.out.println("3. str2 버퍼 크기 : " + str2.capacity());
		str2.append("atom");
		System.out.println("4. str2 : " + str2);
		System.out.println("5. str2 버퍼 크기 : " + str2.capacity());
		
		str2.append("0123456789012345");
		System.out.println("6. str2 : " + str2);
		System.out.println("7. str2 버퍼 크기 : " + str2.capacity());
		
		// 아래 숫자 2는 어디에 삽입할건지 인덱스 위치를 말함
		str2.insert(2, "abcdefg");
		System.out.println("8. str2 : " + str2);
		System.out.println("9. str2 버퍼 크기 : " + str2.capacity());
		
		// 다섯번째부터 20개 지운다는 의미
		str2.delete(5, 20);
		System.out.println("10. str2 : " + str2);
		System.out.println("11. str2 버퍼 크기 : " + str2.capacity());
		
		
	}
}
