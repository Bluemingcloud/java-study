package day14.api.util.date;

import java.util.Calendar;

public class CalendarEx {
	
	public static void main(String[] args) {
		
		// Calendar 클래스
		
		Calendar cal = Calendar.getInstance(); // 객체 안에 날짜, 시간 등이 들어있다.
		
		// get() 을 통해 원하는 값을 얻는다.
		// 상수값으로 구분되어 있다. 
		// Calendar.YEAR = 1, Calendar.Date = 5 등
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		String[] arr1 = {"" + year, "" + (month + 1), "" + day};
		String[] arr2 = {"" + hour, "" + minute, "" + second};
		
		String date = String.join("-", arr1);
		String time = String.join(":", arr2);
		
		System.out.println(date + " " + time);		
		
	}
}
