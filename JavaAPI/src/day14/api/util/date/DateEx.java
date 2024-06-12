package day14.api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		
		// 날짜를 나타내는 Date 객체
		Date date = new Date();	// 날짜 타입		
		System.out.println(date);
		
		// 날짜 타입을 문자열로 형변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String now = sdf.format(date);
		System.out.println(now);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("a h시 m분 E요일");
		String now2 = sdf2.format(date);
		System.out.println(now2);
		
		System.out.println("----------------------------------");
		
		// 날짜 형식의 문자열을 날짜 타입으로 형변환
		String str = "2024-05-31 09:46:07";
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			Date date2 = sdf3.parse(str);
			System.out.println("변경된 날짜 타입 : " + date2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
