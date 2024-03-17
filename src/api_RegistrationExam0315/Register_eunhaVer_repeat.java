package api_RegistrationExam0315;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Register_eunhaVer_repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===================== 회원가입 ======================");
        registerCheck(sc);
        System.out.println("===================================================");
        
        sc.close();
    }
 
 
    public static void registerCheck(Scanner sc) {
        // 회원 정보를 입력받아 검사
        String[] regArr = {"아이디", "비밀번호", "이름", "나이", "전화번호", "이메일", "주민번호"};
        String regExId = "^[\\w-]{4,}$";
        String regExPwd = "^[\\w~!@#$%^&*()+-=]{6,}$";
        String regExName = "^[a-zA-Z가-힣]+$";
        String regExAge = "^\\d{1,3}$";
        String regExTel = "^\\d{2,4}-\\d{3,4}-\\d{3,4}$";
        String regExEmail = "^[\\w-]+@\\w+(\\.\\w+)+$";
        String regExJumin = "^\\d{6}-[1-4]\\d{6}$";
        String[] regExArr = {regExId, regExPwd, regExName, regExAge, regExTel, regExEmail, regExJumin};
        String[] regMsg = {
                            "사용하실 아이디를 입력해주세요. (영문 숫자 '-,_' 조합 허용 4자이상)",
                            "사용하실 패스워드를 입력해주세요. (영문 숫자 키보드숫자특문 조합허용 6자이상)",
                            "이름을 입력해주세요.(한글영어만허용 1자이상)",
                            "나이를 입력해주세요.(1~3자리숫자만)",
                            "전화번호를 입력해주세요.(중간에 '-' 구분자 넣어주세요.)",
                            "이메일을 입력해주세요.",
                            "주민번호를 입력해주세요."
                            };
        String temp;
        String[] memberInfo = new String[regArr.length];
        
        for(int i=0 ; i < regArr.length ; i++) {
            while(true){
                System.out.print((i+1) + ". " + regMsg[i] + " : ");
                temp = sc.nextLine(); 
                if( !Pattern.matches(regExArr[i], temp) ) {
                    System.out.println("   잘못 입력하였습니다. 다시입력해주세요.\n");
                    continue;
                }
                else {
                    memberInfo[i] = temp;
                    System.out.println("   입력하신 " + regArr[i] + " "+ temp +"는 사용이 가능합니다.\n");
                    break;
                }
            }
        }
        System.out.println("==> 축하합니다. 회원가입이 완료되었습니다. \n");
        prtMemberInfo(regArr, memberInfo);
    }
 
    public static void prtMemberInfo(String[] regArr, String[] memberInfo) {
        System.out.println("--------------------------------------------------");
        System.out.println(memberInfo[2] + "님 회원정보");
        System.out.println("--------------------------------------------------");
        for(int i=0 ; i<memberInfo.length ; i++) {
            System.out.println(regArr[i]+" : " + memberInfo[i] );
        }
        System.out.println("--------------------------------------------------");
    }
}
