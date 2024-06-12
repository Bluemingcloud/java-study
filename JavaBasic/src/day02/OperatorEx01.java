package day02;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		// 연산자
		// 단항 연산자 - 항이 하나인것
		
		// 부호 연산자
		int i = +3;	
		int j = -i;
		
		// 증/감 연산자 ++, --
		int k = 1;
		int h = k++;	// 후위연산 - 먼저 값이 대입되고, 그 다음에 증가
						// h 에 k 값이 대입된 후 k 값이 1 증가
		
		System.out.println( "k값 : " + k );
		System.out.println( "h값 : " + h );
		
		int x = 1;
		int y = ++x;	// 전위연산 - 먼저 값이 증가되고, 그 다음에 대입
						// x 값이 1 증가한 후 y 에  증가된 x 값 대입
		
		System.out.println( "x값 : " + x );
		System.out.println( "y값 : " + y );
		
		// int y = ++x; 와 같이 한 번에 사용하지 않고 
		// 보통 아래와 같이 사용 (후위연산을 주로)
		x = 1;
		x++;
		++x;
		System.out.println(x);
		
		System.out.println("--------------------------------------------");
		
		// 비트 연산자 ~ (많이 쓰이지 않음)
		byte b = 10;	// 이진수로는 0000 1010
		System.out.println( ~b );	// 1111 0101 -> 0은 1로, 1은 0으로
									// 왜 위의 값이 11인가
									// 1111 0101
									// 0000 1011 을 합하면
									// 0000 0000 (9자리수는 버려짐) = 0 즉 1111 0101 은 -11
		
		byte test1 = 127;			// 0111 1111
		System.out.println( ~test1 ); // 1000 0000 -> -128 (출력문에서 나온 값)
									// 1000 0000 -> 128
									// byte 는 1000 0000 을 -128 로 인식함으로 -128 부터 127 까지만 저장 가능
		
		byte test2 = 0;				// 0000 0000
		System.out.println( ~test2 );	// 1111 1111 -> -1 (출력문에서 나온 값)
									// 0000 0001 -> 1
		
		System.out.println("--------------------------------------------");
		
		// 논리 반전 연산자 : ! 반대로 바꿔주는 역할. 조건식을 세울 때 사용
		System.out.println( !true ); // false
		System.out.println( !false );// true
		
		boolean bool = !true;		 // bool 에 true 의 반대 값 false 를 대입
		System.out.println( bool );
	}
}
