package api_RegistrationExam0315;

import java.util.Scanner;

public class SignUp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserInfo user = new UserInfo();

		System.out.println("회원가입을 위해 아래 정보들을 기입해 주세요.");

		while (true) {
			System.out.print("아이디 : ");
			String id = scanner.next();
			if (Validator.isValidId(id)) {
				user.setId(id);
				break;
			} else {
				System.out.println("아이디는 4~20자의 영문 대/소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다. 다시 입력해주세요.");
			}
		}

		while (true) {
			System.out.print("비밀번호 : ");
			String password = scanner.next();
			if (Validator.isValidPassword(password)) {
				user.setPassword(password);
				break;
			} else {
				System.out.println("비밀번호는 6~20자의 영문 대/소문자, 숫자,특수기호를 사용하실 수 있습니다. 다시 입력해주세요.");
			}
		}

		while (true) {
			System.out.print("성함 : ");
			String name = scanner.next();
			if (Validator.isValidName(name)) {
				user.setName(name);
				break;
			} else {
				System.out.println("최소 2자리 이상의 한글만 입력하실 수 있습니다. 다시 입력해주세요.");
			}
		}

		while (true) {
			System.out.print("나이 : ");
			String age = scanner.next();
			if (Validator.isValidAge(age)) {
				user.setAge(age);
				break;
			} else {
				System.out.println("최소 1자리 이상 최대 3자리 이하의 숫자만 입력하실 수 있습니다. 다시 입력해주세요.");
			}
		}

		while (true) {
			System.out.print("전화번호('-' 포함) : ");
			String phoneNumber = scanner.next();
			if (Validator.isValidPhoneNumber(phoneNumber)) {
				user.setPhoneNumber(phoneNumber);
				break;
			} else {
				System.out.println("유효하지 않은 전화번호입니다. 다시 입력해주세요.");
			}
		}

		while (true) {
			System.out.print("이메일 : ");
			String email = scanner.next();
			if (Validator.isValidEmail(email)) {
				user.setEmail(email);
				break;
			} else {
				System.out.println("유효하지 않은 이메일입니다. 다시 입력해주세요.");
			}
		}

		while (true) {
			System.out.print("주민등록번호('-' 포함) : ");
			String ssn = scanner.next();
			if (Validator.isValidSsn(ssn)) {
				user.setSsn(ssn);
				break;
			} else {
				System.out.println("유효하지 않은 주민등록번호입니다. '-'을 포함하여 총 14자리로 다시 입력해주세요.");
			}
		}
		scanner.close();
		
		System.out.println("\n회원가입이 완료되었습니다. 입력하신 회원 정보는 다음과 같습니다.");
		System.out.println("아이디 : " + user.getId());
		System.out.println("비밀번호 : " + user.getPassword());
		System.out.println("성함 : " + user.getName());
		System.out.println("나이 : " + user.getAge());
		System.out.println("전화번호 : " + user.getPhoneNumber());
		System.out.println("이메일 : " + user.getEmail());
		System.out.println("주민등록번호 : " + user.getSsn());
	}
}
