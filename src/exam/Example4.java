package exam;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("문장을 입력하세요(종료 희망 시 0을 입력하세요) : ");
			String sentence = scanner.nextLine();
			
			if(sentence.equals("0")) {
				break;
			}
			
			System.out.println("\n입력된 문장은 아래와 같습니다.");
			System.out.println("\"" + sentence + "\"\n");
			
			System.out.print("위 문장에서 찾을 단어를 입력하세요 : ");
			String word = scanner.nextLine();
			
			String location = "";
			int index = sentence.indexOf(word); // 단어가 처음 등장하는 위치 찾기
			int count = 0;
			
			while (index >= 0) { // 단어가 문장에 없을 때까지 반복
				count++;
				int start = index + 1; // 시작이 0번지가 아닌 1번째로 출력하기 위함
				int end = index + word.length(); // 단어 끝 위치
				location += start + "번째에서 " + end + "번째까지 ";
				
				index = sentence.indexOf(word, index + 1); // 다음 중복 단어 찾기
			}
			
			if(count > 0) { // 단어가 하나 이상 있을 경우 출력
				System.out.println("\n해당 단어는 입력하신 문장에 포함되어있으며,");
				System.out.println("문장 내 " + location + "에 위치하고 있습니다.");
				System.out.println("찾으신 단어가 문장에 등장한 총 횟수는 " + count + "번입니다.\n");
			} else {
				System.out.println("해당 단어는 입력하신 문장에 없는 단어입니다.\n");
			}
		}
		System.out.println("프로그램이 종료되었습니다. 감사합니다.");
		scanner.close();
	}
}