package day07;

public class Variable {
	
	// 멤버변수
	int a;						// 기본값으로 자동으로 초기화
	
	// 지역변수
	void printNum(int c) {
		int b = 0;				// 사용전 반드시 초기화
		
		System.out.println("멤버변수 : " + a);	// 멤버변수 클래스 전역에서 사용가능
		System.out.println("지역변수 : " + b);	// 지역변수 메서드 안에서만 사용가능
		System.out.println("매개변수 : " + c);	// 매개변수 지역변수와 같은 성질
	}

}
