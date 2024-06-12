package day09.encap.good;

public class MyDate {
	
	// 정보은닉
	private int year;
	private int month;
	private int day;
	private String ssn;	// 주민번호
	
	/*
	 * 은닉된 변수의 값을 사용할 때는 getter / setter를 사용
	 * 
	 * setter
	 * 1. 은닉변수에 값을 저장할 메서드
	 * 2. 접근제어자는 public으로 선언하고, 이름은 set + 멤버변수명(카멜 표기법)
	 */
	
	public void setYear(int year) {
		// setter를 사용하면, 유효성 검증코드를 넣을 수도 있다.
		if(year < 1 || year > 2024) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		}
		
		this.year = year;
	}
	
	/*
	 * getter
	 * 1. 은닉변수의 값을 조회하는 메서드
	 * 2. 접근 제어자 public 선언하고, 이름은 get + 멤버변수명(카멜 표기법)
	 * 3. 반드시 반환이 있다.
	 */
	
	
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
	
	/*
	 * 1. month, day, ssn 에 대한 getter/ setter 를 생성한다.
	 * month - 1 ~ 12월 까지만 저장됨
	 * day - 1 ~ 31 일 까지만 저장
	 * ssn - "-" 은 제거하고, 문자열의 길이가 13인 경우만 저장되도록
	 */
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		}
		this.month = month;
	}
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		}
		this.day = day;
	}
	
	public void setSsn(String ssn) {
		ssn.replaceAll("-", "");
		if(ssn.length() != 13) {
			System.out.println("잘못된 값 입력입니다.");
			return;			
		}
		this.ssn = ssn;
	}
	
	
	
	
	
	
}
