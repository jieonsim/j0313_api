package api4_String;

// 바깥쪽 공백 무시
public class T01_trim {
	public static void main(String[] args) {
		String str1 = " 안    녕 ";
		String res;
		
		res = "1234" + str1 + "opq";
		System.out.println("res : " + res);
		
		res = "1234" + str1.trim() + "opq";
		System.out.println("res : " + res);
		
		
	}
}
