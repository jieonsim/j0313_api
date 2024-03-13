package exam;

import java.util.Scanner;

public class Example3 {
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

            String locations = ""; // 단어 위치를 기록할 문자열
            int index = sentence.indexOf(word); // 처음 등장하는 위치 찾기

            while (index >= 0) { // 단어가 더 이상 문장에 없을 때까지 반복
                int start = index + 1; // 사용자 친화적인 인덱스로 변환
                int end = index + word.length(); // 단어의 끝 위치
                locations += start + "번째부터 " + end + "번째까지, ";

                index = sentence.indexOf(word, index + 1); // 다음 단어 위치 찾기
            }

            if (!locations.isEmpty()) {
                // 마지막 쉼표와 공백 제거
                locations = locations.substring(0, locations.length() - 2);
                System.out.println("해당 단어는 입력하신 문장에 포함되어있으며,");
                System.out.println("문장 내 " + locations + " 위치하고 있습니다.\n");
            } else {
                System.out.println("해당 단어는 입력하신 문장에 없는 단어입니다.\n");
            }
        }
        System.out.println("프로그램을 종료합니다. 감사합니다.");
        scanner.close();
    }
}