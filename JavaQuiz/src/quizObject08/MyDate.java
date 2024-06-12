package quizObject08;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	// setter
	public void setYear(int year) {
	
		if(year < 1 || year > 2024) {
			System.out.println("잘못된 년도 입력입니다.");
			return;
		}
		
		this.year = year;
	}
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println(month + " : 잘못된 월 입력입니다.");
			return;
		}
		this.month = month;
	}
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println(day + " : 잘못된 날짜 입력입니다.");
			return;
		}
		this.day = day;
	}
	
	public void setSsn(String ssn) {
		ssn = ssn.replaceAll("-", "");
		if(ssn.length() != 13) {
			System.out.println(ssn + " : 잘못된 주민번호 입력입니다.");
			return;			
		}
		this.ssn = ssn;
	}
	
	// getter
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public String getSsn(){
		return ssn;
	}

	public void info() {
		System.out.println("생년월일 : " + year + "-" + month + "-" + day);
		System.out.println("주민번호 : " + ssn);
	}	
}
