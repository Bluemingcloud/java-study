package day02;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		// & | && ||
		int x = 10;
		int y = 20;
		
		// if (조건문) 조건문이 true 라면 if 구문의 실행문이, false 라면 else 구문이 실행된다.
		if( x !=10 && ++y == 21 ) {
		// 앞은 true & 뒤는 false -> false 이므로 else 구문 실행
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		
		System.out.println("x값은 : " + x);
		System.out.println("y값은 : " + y);	// && 인 경우 앞(x != 10)이 false 일 때 뒤 (++y == 21)를 실행하지 않음
											// && 사용시 y 값은 : 20 출력
		
		if( x == 10 || ++y == 21 ) {
		// 앞은 true | 뒤는 false -> true 이므로 if 구문 실행
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		
		System.out.println("x값은 : " + x);
		System.out.println("y값은 : " + y); // || 인 경우 앞(x == 10)이 true 일 때 뒤 (++y == 21)를 실행하지 않음
											// || 사용시 y 값은 : 20 출력
	}	

}
