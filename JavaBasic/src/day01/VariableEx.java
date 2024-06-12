package day01;

public class VariableEx {
	public static void main(String[] args) {
		
		// 변수는 선언과, 초기화 과정을 거칩니다.
		// <데이터타입> <이름>;
		
		// 변수의 선언
		int num; // int는 정수를 저장하는 대표적인 유형
		
		// 변수의 초기화
		num=10;
		
		//변수의 선언과 초기화를 한번에
		System.out.println(num);
		
		int num2 = 20;
		// 변수는 같은 이름으로 선언할 수 없음
		// int num2 = 30;
		System.out.println(num2); // 20
		
		// 변수의 값을 변경
		num2 = 30;
		System.out.println(num2); // 30
		
		// 변수에 다른 변수의 값을 저장할 수 있음
		// 다른 변수값으로 계산 가능
		int result = num + num2 +10;
		System.out.println(result); // 50
		
		// 변수는 타입이 다르면, 바로 저장할 수 없습니다.
		//String str=10; // String 문자열 타입
		
	}
}
