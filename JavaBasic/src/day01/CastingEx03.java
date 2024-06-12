package day01;

public class CastingEx03 {

	public static void main(String[] args) {
		
		// 연산시에도 형변환이 일어납니다.
		char c = 'A';
		int i = 2;
		
		/* 
		 * 연산에서의 형변환 
		 * 
		 * int 보다 작은 타입의 연산은 무조건 int가 된다.
		 * byte + byte -> int
		 * short + byte -> int
		 * 
		 * 연산체계
		 * 프로그램의 기본 연산은 32bit 즉 최소 연산단위가 4byte 라서  
		 * 4byte보다 작은 저장 단위는 4byte의 타입인 int 로 형변환
		 */
		System.out.println( c + i );// char + int -> int
		char cc = (char)(c + i);	// 결과가 int 로 변환되었으므로 char로 다시 캐스팅 해야한다.
		
		/*
		 * int 보다 큰 타입의 연산은 무조건 큰 타입으로 된다.
		 * int + double -> double
		 * long + double -> double
		 */
		
		int k = 3;
		double d = 3.14;
		
		System.out.println( k + d );// 6.14000 int + double -> double 
									// 컴퓨터 연산에서의 오차(이진 부동 소수점 형식의 합에서 나오는 오차)로 인해 6.140000000000001 이라는 값이 나옴.
									// ex) 0.1 을 이진수로 나타내면 무한소수가 됨 때문에 근사한 유한소수로 대신하여 나타냄
	}

}
