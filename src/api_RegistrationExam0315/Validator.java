package api_RegistrationExam0315;

public class Validator {
	// 아이디 : 4~20자의 영문 대/소문자, 숫자와 특수기호(_),(-)만 사용 가능
	public static boolean isValidId(String id) {
		return id.matches("^[a-zA-Z0-9_-]{4,20}$");
	}
	
	// 비밀번호 : 6~20자의 영문 대/소문자, 숫자, 특수기호 사용
	public static boolean isValidPassword(String password) {
		return password.matches("^[a-zA-Z0-9~!@#$%^&*()_+=]{6,20}$");
	}
	
	// 이름 : 한글, 2~6자리
	public static boolean isValidName(String name) {
		return name.matches("^[가-힣]{2,6}$");
	}
	
	// 나이 : 1~3자리 숫자
	public static boolean isValidAge(String age) {
		return age.matches("^\\d{1,3}$");
	}
	
	// 전화번호: 02-123-4567, 043-123-4567, 043-1234-1234, 010-123-4567, 010-1234-5678
	public static boolean isValidPhoneNumber(String phoneNumber) {
		return phoneNumber.matches("^0\\d{1,2}-\\d{3,4}-\\d{4}$");
	}
	
	// 이메일 : 일반적인 이메일 형식
	public static boolean isValidEmail(String email) {
		return email.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?");	
	}
	
	// 주민등록번호 : XXXXXX-XXXXXXX, 하이픈 뒷자리는 1,2,3,4만
	public static boolean isValidSsn(String ssn) {
		return ssn.matches("^[\\d]{6}-[1-4][\\d]{6}$");	
	}
}
