package api_exam;

import java.util.*;

public class Example1_TeacherVersion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] extName = { "jpg", "gif", "png", "hwp", "txt", "xlsx", "zip", "pptx" };
		String[] content = { "그림", "그림", "그림", "한글", "텍스트", "엑셀", "압축", "파워포인트" };
		// 2차원 배열로도 가능
		
		while (true) {
			System.out.println("==================");
			System.out.print("파일명을 입력하세요? ");
			String fileName = sc.next();

			int cnt = 0;
			String ext = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
			for (int i = 0; i < extName.length; i++) {
				if (ext.equals(extName[i])) {
					System.out.println(content[i] + "파일 입니다.");
					break;
				}
				cnt++;
			}
			if (cnt == extName.length)
				System.out.println("잘못된 파일입니다.");

			System.out.print("계속하시겠습니까?(Y/N) ");
			String ans = sc.next();
			if (ans.toUpperCase().equals("N"))
				break;
		}
		System.out.println("=> 작업을 종료합니다.");
		sc.close();
	}
}
