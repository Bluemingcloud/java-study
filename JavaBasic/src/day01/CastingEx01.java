package day01;

public class CastingEx01 {
	public static void main(String[] args) {
		
		/*
		 * 형 변환
		 * 크기가 작은 타입을 큰 타입에 넣을 때는
		 * 자바 가상머신이 자동으로 형변환을 해줍니다.
		 * # byte(1) < short(2) = char(2) < int(4) < long(8) < float(4) < double(8)
		 */
		
		byte b = 10;
		
		short s = b;	// byte -> short 자동형변환
		int i = b;		// byte -> int 자동형변환
		long l = b;		// byte -> long 자동형변환
		
		char c = '가'; 	// 2byte
		int j = c;		// char -> int 자동형변환
		
		System.out.println(j);
		
		int k = 1000;
		double d = k;	// int -> double 자동형변환
		
		System.out.println(d);
	}

}
