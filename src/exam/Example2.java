package exam;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("문장을 입력하세요(종료 희망 시 0을 입력하세요) : ");
			String sentence = scanner.nextLine();
			if (sentence.equals("0")) {
				break;
			}
			
			System.out.println("\n입력된 문장은 아래와 같습니다.");
			System.out.println("\"" + sentence + "\"\n");
			
			System.out.print("위 문장에서 찾을 단어를 입력하세요 : ");
			String word = scanner.nextLine();
			
			int startIndex = sentence.indexOf(word);
			int endIndex = startIndex + word.length() - 1;
			
			if(startIndex != -1) {
				System.out.println("\n해당 단어는 입력하신 문장에 포함되어있으며,");
				System.out.println("문장 내 " + (startIndex + 1) + "번째부터 " + (endIndex + 1) + "번째까지 위치하고 있습니다.\n" );
			} else {
				System.out.println("해당 단어는 입력하신 문장에 없는 단어입니다.\n");
			}
			
			
		}
		System.out.println("프로그램을 종료합니다. 감사합니다.");
		scanner.close();
	}
}