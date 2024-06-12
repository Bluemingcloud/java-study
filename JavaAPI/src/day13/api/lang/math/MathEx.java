package day13.api.lang.math;

public class MathEx {
	
	public static void main(String[] args) {
		
		// Math
		// 랜덤값
		double d = Math.random();
		System.out.println(d);
		
		// 올림
		System.out.println( Math.ceil(1.1) );
		// 내림
		System.out.println( Math.floor(1.1) );
		// 반올림
		System.out.println( Math.round(1.5) );
		// 절댓값
		System.out.println( Math.abs(-3) );
		// 더 큰값
		System.out.println( Math.max(5, 3));
		// 더 작은값
		System.out.println( Math.min(2, 7));
		// 라운드 인트
		System.out.println( Math.rint(d));
	}

}
