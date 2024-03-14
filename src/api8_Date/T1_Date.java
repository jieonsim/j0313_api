package api8_Date;

// date , simpledataformat , format 짝꿍!!
import java.text.*;
import java.util.*;

// Data util이랑 sql 둘다 있는데 util로 써야 함
public class T1_Date {
	public static void main(String[] args) {
		// Date 객체
		Date now = new Date();
		System.out.println("1. 오늘의 날짜(기본형식) : " + now);

		// 날짜 객체를 문자화 : toString()
		String strNow = now.toString();
		System.out.println("2. 오늘의 날짜(문자형식) : " + strNow);
		System.out.println();

		// 날짜 연산 하려면 날짜 형식, 그게 아니라면 문자 형식(toString)으로 바꿔서 사용

		// 날짜 형식을 사용자 지정에 따라서 변경 : SimpleDataFormat()
		// 매개변수 : 년도(yy(두자리), yyyy(네자리)), 월(M(대문자)), 일(d), 시간(h,H(24시간)), 분(m(소문자)), 초(s)
		SimpleDateFormat sdf = new SimpleDateFormat();
		String strNow1 = sdf.format(now);
		System.out.println("기본 날짜 시간 포맷 : " + strNow1);

		sdf = new SimpleDateFormat("yyyy-MM-dd");
		strNow1 = sdf.format(now);
		System.out.println("yyyy-MM-dd : " + strNow1);

		sdf = new SimpleDateFormat("MM/dd/yyyy");
		strNow1 = sdf.format(now);
		System.out.println("MM/dd/yyyy : " + strNow1);

		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		strNow1 = sdf.format(now);
		System.out.println("yyyy년 MM월 dd일 : " + strNow1);

		sdf = new SimpleDateFormat("yy년 M월 d일");
		strNow1 = sdf.format(now);
		System.out.println("yy년 M월 d일 : " + strNow1);
		System.out.println();

		// 시간
		sdf = new SimpleDateFormat("hh:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("hh:mm:ss : " + strNow1);

		sdf = new SimpleDateFormat("h:m:s");
		strNow1 = sdf.format(now);
		System.out.println("h:m:s : " + strNow1);

		sdf = new SimpleDateFormat("HH:m:s");
		strNow1 = sdf.format(now);
		System.out.println("HH:m:s : " + strNow1);

		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("yyyy-MM-dd HH:mm:ss : " + strNow1);

		System.out.println("오늘 날짜 : " + strNow1.substring(0, 10)); // 0번째 인덱스부터 10번째 인덱스 앞까지 추출
		
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("yyyy.MM.dd HH:mm:ss : " + strNow1);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		strNow1 = sdf.format(now);
		System.out.println("yyyy년 MM월 dd일 HH시 mm분 ss초 : " + strNow1);
		System.out.println();
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now)); // 별도 변수 안주고 바로 대입
		
		sdf = new SimpleDateFormat("오늘은 올해의 D번째 날"); // 1월 1일부터 계산
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 이번달의 d번째 날"); // 이번달부터 계산
		System.out.println(sdf.format(now));		
		
		sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss", Locale.ENGLISH);
		// locale.english를 붙여주면 영어 요일이 나옴
		System.out.println(sdf.format(now));
				
		
		
		
		
		

	}
}
