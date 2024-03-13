package api3_Class;

public class Test2 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("String 클래스가 존재합니다.");
			
			// 객체의 정보(Test1.class) 알아내어 출력하기
			// Test1 타입이 아닌 Class 타입으로 써야한다
			Class clazz = Test1.class;
			System.out.println("전체 이름(패키지명 + 파일명) : " + clazz.getName());
			System.out.println("패키지명 : " + clazz.getPackage());
			System.out.println("타입명 : " + clazz.getTypeName());
			System.out.println("simple 이름 : " + clazz.getSimpleName());
			System.out.println();
			
			Class imgPath = Test2.class;
			System.out.println("그림 파일의 경로명 : " + imgPath.getResource("./images/121.jpg").getPath());
			System.out.println("Test2.class의 경로명: " + imgPath.getResource("Test2.class").getPath());
			System.out.println("Test2.class의 경로명: " + clazz.getResource("Test2.class").getPath());
			System.out.println("현재 작업 경로의 루트(/)명 : " + clazz.getResource("/").getPath());
			System.out.println("그림 파일의 경로명1 : " + imgPath.getResource("/api3_Class/images/122.jpg").getPath());
			// 첫번째 슬래시 앞에 .을 추가하면 그건 상대경로가 된다. 이건 절대경로 첫 슬래시부터가 src 폴더임
			// 잘못된 경로와 파일명을 입력한 nullpointerexception 에러 발생
//			System.out.println("그림 파일의 경로명2 : " + imgPath.getResource("/images/122.jpg").getPath());
			System.out.println("api2_System 패키지의 Test1.class 경로명1 : " + imgPath.getResource("/api2_System/Test1.class").getPath());
			// 절대경로
			System.out.println("api2_System 패키지의 Test1.class 경로명2 : " + imgPath.getResource("../api2_System/Test1.class").getPath());
			// 상대경로  ..은 내 상위 디렉토리 .은 현재 내 디렉토리
//			System.out.println("api2_System 패키지의 Test1.class 경로명3 : " + imgPath.getResource("../../src/api2_System/Test1.class").getPath());
			// 최상위 폴더 (src(또는 bin))를 벗어나면 경로와 파일명을 찾을 수 없다
		} catch (ClassNotFoundException e) {
			 System.out.println("클래스 파일이 존재하지 않습니다." + e.getMessage());
		} finally {
			System.out.println("작업 끝");			
		}
	}

}
