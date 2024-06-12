package day01;

public class DataTypeEx2 {
	public static void main(String[] args) {
		
		//단일문자를 저장하는 char 타입		
		//char c1 = 'AA';	// 두글자는 저장 안 됨
		char c1 = 'A';
		char c2 = 65;		// 1byte 문자체계 알파벳에 숫자값을 지정 (아스키코드). 그 숫자값을 입력하면 대응하는 알파벳이 나온다.
						
		System.out.println(c1);
		System.out.println(c2);
		
		char c3 = '가';		// 유니코드 - 2byte크기로 확장시키고 65536개의 문자 표현 (부호 없는 체계로 사용하여 이진수의 16자리수 전부 사용)
		char c4 = 44032;	// char 의 최소크기가 2byte인 이유이다.		
		char c5 = '\uC00D';	// 유니코드를 나타냄

		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println("------------------------------------");
		
		// 문자열을 나타내는 String 타입
		String s1 = "Hello ";
		String s2 = "World ";
		String s3 = "^o^";
		
		// 문자열은 + 로 붙여서 출력가능
		System.out.println( s1 + s2 + s3 );
		
		 // 문자열에 다른타입이 붙으면 문자열이 된다.
		int a1 = 100;
		String s4 = "hello";
		String s5 = s4 + a1; // a1이 정수 타입이지만 s4 + a1 은 String 타입으로 저장
		
		System.out.println( s5 );
		System.out.println( "hello" + 100 );
		System.out.println( "200" + 100 );			// 200100
		System.out.println( 100 + 200 + "300" );	// 300300
		
		// 연산시의 형변환에 의해 int 보다 작은 타입의 연산에서 int 로 형변환
		System.out.println( "A" + 10 );				// String + int -> String A10
		System.out.println( 'A' + 10 );				// char + int -> int 75  
		System.out.println( 'A' + 'B' );			// char + char -> int 131		
		
	}
}
