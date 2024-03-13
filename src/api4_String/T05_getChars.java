package api4_String;

public class T05_getChars {
	public static void main(String[] args) {
		String str1 = "Hello1";
		
		char[] strArr = new char[str1.length()];
		str1.getChars(0, str1.length(), strArr, 0); // 배열복사
		System.out.println("strArr : " + strArr);
		System.out.println();
		
		String temp = "";
		for(char str : strArr) {
			temp += str + "/";
		}
		System.out.println(temp);
		System.out.println(temp.substring(0, temp.length() - 1));
		// ↑ 마지막 슬래시 없이 출력!
	}	
}
