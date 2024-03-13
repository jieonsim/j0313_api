package api5_Wrapper;

// Wrapper 클래스 : 기본 타입을 참조 타입으로(Boxing), 참조 타입을 기본 타입으로(Unboxing) 형변환

public class Test1 {
	public static void main(String[] args) {
		int intSu1 = 100;
		int intSu2 = 200;

		System.out.println("1. intSu1 + 100 : " + (intSu1 + 100));

		// 정수형 Boxing 처리 (기본타입 int -> 참조타입(객체) Integer 로 타입 변환)
		Integer objSu1 = new Integer(intSu1); // 중간라인 그어진 거는 옛날 방식이다 라는 의미
		System.out.println("2. objSu1 + 100 : " + (objSu1 + 100)); // 가능

		// 자동 박싱 처리의 예
		Integer objSu2;
		objSu2 = intSu1;
		System.out.println("3. objSu2 + 100 : " + (objSu2 + 100)); // 초기값 안주면 에러남

		// UnBoxing 처리
		String strIntSu1 = "100";
		System.out.println("strIntSu1 + 100 = " + (strIntSu1 + 100)); // 문자열두개붙여서나옴
		System.out.println("strIntSu1 + 100 = " + (Integer.parseInt(strIntSu1) + 100)); // 연산됨

		// double <-> Double
		double dblSu = 3.14;
		Double objDblSu = new Double (dblSu);
		System.out.println("2. objDblSu + 100.5 : " + (objDblSu + 100.5));
		
		// Boxing
		int su3 = 100;
		Integer objSu3 = Integer.valueOf(su3); // 기본 타입을 객체 타입으로 박싱한거
		System.out.println("3. objSu3 + 100 : " + (objSu3 + 100)); // 초기값 안주면 에러남
		
		// UnBoxing
		int su4 = Integer.valueOf(objSu3);
		System.out.println("su4 + 100 : " + (su4 + 100));
		
		
	}
}
