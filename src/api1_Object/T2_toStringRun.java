package api1_Object;

public class T2_toStringRun {
	public static void main(String[] args) {
		T2_toStringVO vo = new T2_toStringVO();
		
		String name = "김말숙";
		int age = 30;
		boolean gender = false;
		String job = ""; // 안넣으면 null이 나오기 때문에 이렇게 비워두는 것
		String address = "청주";
		
		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setJob(job);
		vo.setAddress(address);
		
		System.out.println("이름 : " + vo.getName());				// 이거랑 아래랑 둘 다 동일하게 나옴ㅁㅁㅁㅁ
		System.out.println("이름 : " + vo.getName().toString());
		System.out.println("나이 : " + vo.getAge());
		System.out.println("성별 : " + vo.isGender());
		System.out.println("직업 : " + vo.getJob());
		System.out.println("주소 : " + vo.getAddress());
		System.out.println();
		
		// toString Override 통해 출력 가능토록 하게 함
		// 값이 넘어왔는지 아닌지 toString 통해 찍어보자
		// 넘어오지 않았다면 객체의 주소가 나올 것이다
		// 객체변수.toString() 의 toString()은 보통 생략해서 출력한다.
		System.out.println("vo : " + vo.toString());
		System.out.println("vo : " + vo);
		
		
	}
}
