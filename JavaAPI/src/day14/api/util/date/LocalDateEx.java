package day14.api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateEx {
	
	public static void main(String[] args) {
		
		/*
		 * LocalDate
		 *  - 해당 지역(한국)의 년 월 일 을 나타내는 클래스
		 *  
		 * LocalTime
		 *  - 해당 지역(한국)의 시 분 초 를 나타내는 클래스
		 *  
		 * LocalDateTime
		 *  - 해당 지역(한국)의 년 월 일 시 분 초 를 나타내는 클래스
		 */
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		System.out.println("--------------------------------");
		
		// LocalDateTime 을 String 으로 형변환
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		String now = dtf.format(datetime);
		System.out.println(now);
		
		System.out.println("--------------------------------");
		
		// String 을 LocalDateTime 으로 형변환
		
		LocalDateTime datetime2 = LocalDateTime.parse(now, dtf);
		System.out.println(datetime2);
		
	}

}
