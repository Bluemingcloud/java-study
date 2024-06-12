package day01;

public class DataTypeEx {
	public static void main(String[] args) {
		
		//정수형 타입
		byte a1 = 127; // -128 ~ 127
		byte a2 = -128; // 컴퓨터에서 아주 중요한 단위
		System.out.println("byte 는 " + a1 + " 부터 " + a2 + " 까지 저장");
		
		short b1 = 32767; // 거의 사용하지 않음
		short b2 = -32768;
		System.out.println("short 는 " + b1 + " 부터 " + b2 + " 까지 저장");
		
		int c1 = 2147483647;
		int c2 = -2147483648;
		System.out.println("int 는 " + c1 + " 부터 " + c2 + " 까지 저장");
		
		long d1 = 123123123123123L;
		System.out.println(c1 + " 보다 큰 long 값인 " + d1 + " 는 맨 뒤에 L을 붙인다.");
		
		/*
		 * 2진수 - 0b를 앞에 붙임
		 * 8진수 - 0을 앞에 붙임
		 * 16진수 - 0x를 앞에 붙임
		 */
		
		int bin =0b1010; // 이진수 1010
		System.out.println("이진수 1010 은 : "+ bin +" 입니다.");
		System.out.println("----------------------------------");
		
		// 실수형 타입
		float f1 = 3.14F; //F를 뒤에 붙인다.
		double d2 = 3.14;
		
		System.out.println(f1);
		System.out.println(d2);
		
		float f2 = 3.141592653F;
		double d3 = 3.141592653;
		
		System.out.println(f2);  // 실수부분 7자리수 까지 저장 -> 3.1415927
		System.out.println(d3);  // 실수부분 15자리수 까지 저장
		
		// e표기법 - 나타낼수 있는 소수점 자리가 너무 크거나, 작은경우에 컴퓨터가 알아서 써줌
		float f3 = 314.15e-2F;
		System.out.println(f3);
		float f4 = 0.031415e2F;
		System.out.println(f4);
		
		System.out.println("----------------------------------");
		
		boolean bool = true;   // 소문자로 입력해야 함
		boolean bool2 = false;
		
		System.out.println(bool);
		System.out.println(bool2);
		
		
		
	}
}
