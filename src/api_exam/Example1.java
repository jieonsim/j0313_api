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

		String[] engExtensions = { "jpg", "txt", "zip", "xlsx", "hwp", "gif" };
		String[] korExtensions = { "그림파일", "텍스트파일", "압축파일", "엑셀파일", "한글파일", "그림파일" };

		while (true) {
			System.out.print("파일명을 입력하세요 : ");
			String fileName = scanner.nextLine().toLowerCase();

			String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
			// lastIndexOf : 파일 이름에서 마지막에 나타나는 점(.)의 위치 찾기
			// 마지막 점 위치 바로 다음에 확장자가 시작되므로 점 다음 위치에 가기위해 +1
			// substring : 점 다음 위치부터 파일 이름의 끝까지 확장자 부분을 잘라 추출
			String fileType = "알 수 없는 파일";

			for (int i = 0; i < engExtensions.length; i++) {
				if (fileExtension.equals(engExtensions[i])) {
					fileType = korExtensions[i];
					break;
				}
			}
			System.out.println(fileName + " ==> " + fileType);

			System.out.print("계속할까요 ? (Y/N) ");
			String answer = scanner.nextLine().toUpperCase();
			if (answer.equals("N")) {
				break;
			}
			System.out.println("======================");
		}
		System.out.println("수고하셨습니다.");
		scanner.close();
	}
}