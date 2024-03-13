package j0312_exam_repeat;

import java.util.*;

public class SubString_Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String message = "Welcome to Korea!!!";
		
		int location = 0;
		int totalLocation = 0;
		int count = 0;
		
		System.out.println("입력된 문자열 : " + message);
		System.out.print("찾고자 하는 문자를 입력하세요 : ");
		String word = scanner.nextLine();
		
		while(true) {
			location = message.indexOf(word); // indexOf() 를 이용하여 
			if (location == -1) {
				break;
			}
			totalLocation += location;
			System.out.println((count + 1) + "번째 위치(인덱스) : " + totalLocation);
			message = message.substring(location + 1);
			count++;
			totalLocation++;
		}
		System.out.println(word + "문자는 총 " + count + "개 있습니다.");
		scanner.close();
	}
}
