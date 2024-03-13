package api4_String;

public class T07_split {
	public static void main(String[] args) {
		// split() : 문자열을 특정 문자(열)로 분리시킨 후 분리된 각각의 항목을 배열로 저장시켜준다. 반드시 배열로 받아야함
		// (or 연산자 : |) 정규식에는 or 연산자 || 두개가 아니라 | 한개다

		String tel = "010-1234-5678";

		// 콤보상자
		// 앞의 전화번호를 -으로 분리시킨 후 배열로 저장시켜준다
		String[] telArr = tel.split("-");

		System.out.println(telArr[0]);
		System.out.println(telArr[1]);
		System.out.println(telArr[2]);
		System.out.println();

		String telTemp = "";
		for (String t : telArr) {
			telTemp += t + "/";
		}
		System.out.println(telTemp);
		System.out.println(telTemp.substring(0, telTemp.length() - 1));
		System.out.println();

		String[] titles = { "지역번호", "국번호", "전화번호" };
		for (int i = 0; i < telArr.length; i++) {
			System.out.println(titles[i] + " : " + telArr[i]);
		}
		System.out.println();
		
		// 각 이름의 구분자를 '/'로 통일하여 출력하시오
		String names = "홍길동/이기자&김말숙:오하늘;소나무 고인돌";
		System.out.println(names);
		
		// 방법1
		String[] nameArr = names.split("/|&|:|;| ");
		String nameTemp = "";
		for (String name : nameArr) {
			nameTemp += name + " / ";
		}
		System.out.println("이름 : " + nameTemp.substring(0, nameTemp.length() - 2));
		
		// 방법2 : join() 배열에 분리 저장되어 있는 항목들을 특정 문자로 결합시켜준다 => 사용하기에 방법2번이 낫다.
		String nameJoin = String.join(" / ", nameArr);
		System.out.println("이름 : " + nameJoin);

	}
}
