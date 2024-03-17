package api_RegistrationExam0315;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Register_EunhaVer_Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========= 회원 가입 =========");
        registerCheck(scanner);
        System.out.println("=======================");
        
        scanner.close();
        
    }

    public static void registerCheck(Scanner scanner) {
        // 회원 정보, 검증할 정규 표현식, 메시지를 2차원 배열로 정의
        String[][] regData = {
            {"아이디", "^[\\w-]{4,}$", "아이디를 입력해 주세요.(4자 이상의 영문, 숫자와 특수기호(_),(-)만 사용 가능합니다.)"},
            {"비밀번호", "^[\\w~!@#$%^&*()+-=]{6,}$", "비밀번호를 입력해 주세요.(6자 이상의 영문 대/소문자, 숫자, 특수문자를 사용해 주세요.)"},
            {"이름", "^[a-zA-Z가-힣]+$", "이름을 입력해 주세요.(1자 이상의 한글, 영문만 가능합니다.)"},
            {"나이", "^\\d{1,3}$", "나이를 입력해 주세요.(최소 1자리 이상 ~ 최대 3자리 이하의 숫자만 가능합니다.)"},
            {"전화번호", "^\\d{2,4}-\\d{3,4}-\\d{3,4}$", "전화번호를 입력해 주세요.(중간에 '-' 구분자를 넣어주세요.)"},
            {"이메일", "^[\\w-]+@\\w+(\\.\\w+)+$", "이메일을 입력해 주세요."},
            {"주민번호", "^\\d{6}-[1-4]\\d{6}", "주민등록번호를 입력해 주세요."}
        };
        
        String temp;
        String[] userInfo = new String[regData.length];
        
        for(int i = 0; i < regData.length; i++) {
            while(true) {
                System.out.print((i + 1) + ". " + regData[i][2] + " : ");
                temp = scanner.nextLine();
                if (!Pattern.matches(regData[i][1], temp)) {
                    System.out.println("   잘못 입력하셨습니다. 다시 입력해 주세요. \n");
                    continue;
                } else {
                    userInfo[i] = temp;
                    System.out.println("   입력하신 " + regData[i][0] + " " + temp + "는 사용이 가능합니다.\n");
                    break;
                }
            }
        }
        System.out.println("→ 축하합니다. 회원가입이 완료되었습니다.\n");
        printUserInfo(regData, userInfo);
    }
    
    public static void printUserInfo(String[][] info, String[] userInfo) {
        System.out.println("------------------------------------------");
        System.out.println(userInfo[2] + "님 회원 정보");
        System.out.println("------------------------------------------");
        for (int i = 0; i < userInfo.length; i++) {
            System.out.println(info[i][0] + " : " + userInfo[i]);
        }
        System.out.println("-------------------------------------------");
    }
}
