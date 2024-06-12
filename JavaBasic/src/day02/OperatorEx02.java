package day02;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		// 2항 연산자
		
		// 산술 연산자 : + - * / %
		
		int i = 7 / 3;
		int j = 7 % 3;
		int k = 7 * 3;
		System.out.println( "/ 몫을 계산 한 i값 : " + i );
		System.out.println( "% 나머지를 계산 한 j값 : " + j );
		System.out.println( "* 곱을 계산 한 k값 : " + k );
		
		System.out.println("-----------------------------------");
		
		// 비교 연산자 >=, >, ==, !=
		
		System.out.println( i == j );	// false
		System.out.println( i != j );	// true
		System.out.println( i >= j );	// true
		System.out.println( i <= j );	// false
		System.out.println( i < j );	// false
		
					 // int k = 7*3;
		System.out.println( k % 2 == 0 );	// false	2로 나눴을 때 0인가 -> 짝수 인가?
		System.out.println( k % 2 != 0 );	// true		2로 나눴을 때 0이 아닌가 -> 홀수 인가?
		System.out.println( k % 5 == 0 );	// false	5로 나눴을 때 0인가 -> 5의 배수 인가?
		
		System.out.println("-----------------------------------");
		
		// 비트 연산자 
		byte b1 = 5;					// 0000 0101
		byte b2 = 3;					// 0000 0011
		
		System.out.println( b1 & b2 );	// 0000 0001 AND 연산 : 둘다 1 이면 1, 아니면 0
		System.out.println( b1 | b2 );	// 0000 0111 OR  연산 : 둘중 하나라도 1 이면 1, 아니면 0
		System.out.println( b1 ^ b2 );	// 0000 0110 XOR 연산 : 두 값이 다르면 1, 같으면 0
		
		// 비트 쉬프트 연산자 >>, <<
		int c = 192;					// 0000 0000 1100 0000
		System.out.println( c >> 2 );	// 0000 0000 0011 0000 >> 오른쪽 2칸
		System.out.println( c << 2 );	// 0000 0011 0000 0000 << 왼쪽 2칸
	}

}
