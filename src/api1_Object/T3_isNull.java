package api1_Object;

import java.util.*;

public class T3_isNull {
	public static void main(String[] args) {
		T2_toStringVO vo = new T2_toStringVO();
		System.out.println("vo : " + vo);
		
		if (vo == null) {
			System.out.println("1. vo는 null입니다.");
		} else {
			System.out.println("1. vo는 null이 아닙니다.");
		}
		System.out.println();
		
		if (vo.getName() == null) {
			System.out.println("2. vo.name은 null입니다.");			
		} else {			
			System.out.println("2. vo.name은 null이 아닙니다.");
		}
		System.out.println();
		
		if (Objects.isNull(vo)) {
			System.out.println("3. vo는 null입니다.");
		} else {
			System.out.println("3. vo는 null이 아닙니다.");		
		}
		System.out.println();
		
		if (Objects.nonNull(vo)) {
			System.out.println("4. vo는 null이 아닙니다.");
		} else {
			System.out.println("4. vo는 null입니다.");		
		}
		System.out.println();
		
//		vo.setName("홍길동");
		if (Objects.nonNull(vo.getName())) {
			System.out.println("5. name은 " + vo.getName() + "입니다.");
			if(vo.getName().equals("홍길동")) {
				System.out.println("관리자");
			} else {
				System.out.println("방문객");
			}
		} else {
			System.out.println("5. name은 null입니다.");		
		}
		System.out.println();
		
		vo.setName("홍길동");
		if (vo.getName().equals("홍길동")) {
			System.out.println("6. name은 " + Objects.requireNonNull(vo.getName()) + "입니다.");
//			if(vo.getName().equals("홍길동")) {
//				System.out.println("관리자");
//			} else {
//				System.out.println("방문객");
//			}
		} else {
			System.out.println("6. name은 null입니다.");		
		}
		System.out.println();
		
		vo.setName(null);
//		System.out.println("7. name은 " + vo.getName() + "입니다.");
		System.out.println("8. name은 " + Objects.requireNonNull(vo.getName()) + "입니다.");
		// 있으면 필수 출력하세요 ↑
	}
}
