package api_RegistrationExam0315;

/*
 아이디 : 영문(대소), _, -, 숫자 ==> 4자이상
 	비밀번호 : 영문(대소), ~!@#$%^&*()_+-=, 숫자 ==> 6자이상
 	성함 : 영문(대소), 한글
	나이 : 숫자
	전화번호 : 02-123-4567, 043-123-4567, 043-1234-1234, 010-123-4567, 010-1234-5678
	이메일 : 
	주민등록번호 : 123456-1234567 (8번째 1,2,3,4만 와야하는 유효성 체크) | 뒤에 13자리는 체크핏이라는 걸 이용 예정 
 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class Register_EunhaVersion_ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("========= 회원 가입 =========");
		registerCheck(scanner);
		System.out.println("=======================");
		
		scanner.close();
		
	}

	public static void registerCheck(Scanner scanner) {
		// 회원 정보를 입력받아 유효성 검사
		String[] info = { "아이디", "비밀번호", "이름", "나이", "전화번호", "이메일", "주민번호" };
		String id = "^[\\w-]{4,}$";
		String password = "^[\\w~!@#$%^&*()+-=]{6,}$";
		String name = "^[a-zA-Z가-힣]+$";
		String age = "^\\d{1,3}$";
		String phoneNumber = "^\\d{2,4}-\\d{3,4}-\\d{3,4}$";
		String email = "^[\\w-]+@\\w+(\\.\\w+)+$";
		String ssn = "^\\d{6}-[1-4]\\d{6}";
		String[] regInfo = { id, password, name, age, phoneNumber, email, ssn };
		String[] message = 
			{
					"아이디를 입력해 주세요.(4자 이상의 영문, 숫자와 특수기호(_),(-)만 사용 가능합니다.)",
					"비밀번호를 입력해 주세요.(6자 이상의 영문 대/소문자, 숫자, 특수문자를 사용해 주세요.)",
					"이름을 입력해 주세요.(1자 이상의 한글, 영문만 가능합니다.)",
					"나이를 입력해 주세요.(최소 1자리 이상 ~ 최대 3자리 이하의 숫자만 가능합니다.)",
					"전화번호를 입력해 주세요.(중간에 '-' 구분자를 넣어주세요.)",
					"이메일을 입력해 주세요.",
					"주민등록번호를 입력해 주세요."
			};
		
		String temp;
		String[] userInfo = new String[info.length];
		
		for(int i = 0; i < info.length; i++) {
			while(true) {
				System.out.print((i + 1) + ". " + message[i] + " : ");
				temp = scanner.nextLine();
				if (!Pattern.matches(regInfo[i], temp)) {
					System.out.println("   잘못 입력하셨습니다. 다시 입력해 주세요. \n");
					continue;
				} else {
					userInfo[i] = temp;
					System.out.println("   입력하신 " + info[i] + " " + temp + "는 사용이 가능합니다.\n");
					break;
				}
			}
		}
		System.out.println("→ 축하합니다. 회원가입이 완료되었습니다.\n");
		printUserInfo(info, userInfo);
	}
	
	public static void printUserInfo(String[] info, String[] userInfo) {
		System.out.println("------------------------------------------");
		System.out.println(userInfo[2] + "님 회원 정보");
		System.out.println("------------------------------------------");
		for (int i = 0; i < userInfo.length; i++) {
			System.out.println(info[i] + " : " + userInfo[i]);
		}
		System.out.println("-------------------------------------------");
	}
}
