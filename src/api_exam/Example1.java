package api_exam;

import java.util.*;

/*
  콘솔을 통해서 파일명을 입력받은후, 입력받은 파일의 성격을 구해서 화면에 출력하시오.
  예) 화일명을 입력하세요? abc.jpg
     abc.jpg ==> 그림파일
     계속할까요?(Y/N) Y
     ================================
     화일명을 입력하세요? atom.txt
     atom.txt ==> 텍스트파일
     계속할까요?(Y/N) y
     ================================
     화일명을 입력하세요? mbc.zip
     mbc.zip ==> 압축파일
     계속할까요?(Y/N) Y
     ================================
     화일명을 입력하세요? sbs.xlsx
     sbs.xlsx ==> 엑셀파일
     계속할까요?(Y/N) y
     ================================
     화일명을 입력하세요? seoul.hwp
     seoul.hwp ==> 한글파일
     계속할까요?(Y/N) Y
     ================================
     화일명을 입력하세요? busan.gif
     busan.hwp ==> 그림파일
     계속할까요?(Y/N) n
     ================================
     수고하셨습니다.
*/

public class Example1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			String[] engExtensions = { "jpg", "txt", "zip", "xlsx", "hwp", "gif" };
			String[] korExtensions = { "그림파일", "텍스트파일", "압축파일", "엑셀파일", "한글파일", "그림파일" };
			
			System.out.print("파일명을 입력하세요 : ");
			String fileName = scanner.next();
//			if(fileName.indexOf() {
//				System.out.println();
//				
//			} else {
//				System.out.println("존재하지 않는 파일입니다.");
//			}
//			
			HashMap<String, String> map = new HashMap<>();

			map.put("jpg", "그림파일");
			map.put("txt", "텍스트파일");
			map.put("zip", "압축파일");
			map.put("xlsx", "엑셀파일");
			map.put("hwp", "한글파일");
			map.put("gif", "그림파일");

			System.out.println(" ==> ");
			System.out.println("계속할까요 ? (Y/N)");
			String respond = scanner.next().toUpperCase();
			if (respond.equals("N")) {
				break;
			}
			System.out.println("수고하셨습니다.");
		}
		scanner.close();
	}
}
