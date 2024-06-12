package day01;

public class CastingEx02 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 타입을 작은 타입으로 변환 할 때는 
		 * (타입) 캐스팅을 사용해서 명시적 형변환을 해야한다.
		 */
		int i = 70;
		char c = (char)i;	// c -> 알파벳 F
		byte b = (byte)i;	// 70
		
		System.out.println(c);
		System.out.println(b);
		
		double d = 3.14;
		int j = (int)d;		// j -> 3
		
		System.out.println(j);
		
		/*
		 * 주의할 점
		 * 명시적 형변환시에 값을 저장할 수 없는 범위가 되면,
		 * 범위 외는 잘려나간 값이 저장된다.
		 */
				
		int k = 1000;		// 1000은 이진수로 0011 1110 1000
		byte b2 = (byte)k;	// byte로 캐스팅 하면 1110 1000 까지만 저장 가능 (저장 가능 범위 외에는 잘려나감)
		System.out.println(b2);
		
		//예외적으로 형변환을 해야하는 경우
		//char -> short, (char 의 크기는 2byte로 short 와 같으나 예외적으로 형변환을 해야함)
		char cc = 'A';
		short ss = (short)cc;
		
		System.out.println(ss);
		
	}

}
