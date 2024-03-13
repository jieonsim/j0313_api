package api4_String;

public class T11_StringBuilder {
	public static void main(String[] args) {
		String res = new StringBuffer()
				.append("Seoul")
				.append("/Busan")
				.append("/Cheongju")
				.append("/Jeju")
				.toString();
		System.out.println("res : " + res);
		System.out.println();
		
		StringBuilder str2 = new StringBuilder();
		System.out.println("옹량 : " + str2.capacity());
		System.out.println("3. str2 버퍼 크기 : " + str2.capacity());
		str2.append("atom");
		System.out.println("4. str2 : " + str2);
		System.out.println("5. str2 버퍼 크기 : " + str2.capacity());
		
		str2.append("0123456789012345");
		System.out.println("6. str2 : " + str2);
		System.out.println("7. str2 버퍼 크기 : " + str2.capacity());
		
		str2.insert(2, "abcdefg");
		System.out.println("8. str2 : " + str2);
		System.out.println("9. str2 버퍼 크기 : " + str2.capacity());
		
		str2.replace(2, 5, "!!!!!!!");
		System.out.println("10. str2 : " + str2);
		System.out.println("11. str2 버퍼 크기 : " + str2.capacity());
		
		str2.delete(5, 20);
		System.out.println("12. str2 : " + str2);
		System.out.println("13. str2 버퍼 크기 : " + str2.capacity());
	}
}
