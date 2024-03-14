package api8_Date;

import java.util.*;

public class T6 {
	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar calendar = Calendar.getInstance(timeZone);

		int amPm = calendar.get(Calendar.AM_PM);
		String strAmPm = "";

		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);

		System.out.println("미국 로스앤젤레스 현재 시각 : " + strAmPm + " " + hour + "시 " + minute + "분 " + second + "초");
	}
}
