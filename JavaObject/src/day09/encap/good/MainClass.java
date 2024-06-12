package day09.encap.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 은닉이 없다면, 잘못된 값이 저장될 수도 있다.
		// 또는 중요한 값을 누구나 가져갈 수도 있다.
		MyDate me = new MyDate();
		
		me.setYear(2025);
		me.setYear(2024);
		
		int year = me.getYear();
		System.out.println("년도 : " + year);
		
	}
}
