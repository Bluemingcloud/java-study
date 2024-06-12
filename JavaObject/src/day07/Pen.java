package day07;

// 설계도 클래스는 메인 메서드가 없다. (main 을 만들 필요가 없음.)
public class Pen {
	
	// 클래스 속성을 나타내는 멤버변수(필드)
	String ink;
	int price;
	String company;
	
	// 클래스 기능을 표현하는 메서드
	void write() {
		System.out.println(ink + " 색상 글씨를 씁니다.");
	}
	void info() {
		System.out.println("------펜의 정보------");
		System.out.println("색상 : " + ink);
		System.out.println("가격 : " + price);
		System.out.println("제조사 : " + company);
	}
	// 생성자를 쓰지 않으면 아래와 같은 기본 생성자가 자동 생성된 것 처럼 저장된다.
	// 메서드와 헷갈리지 말 것. 생성자는 반환(return)이 없다.
//	Pen() {
//		
//	}
	// 생성자는 프로그래머가 직접 만들게 되면, 기본생성자를 자동으로 만들어 주지 않음.
	/*
	Pen(String pInk) {
	
	}
	 */

}
