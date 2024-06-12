package day02;

public class OperatorEx05 {
	public static void main(String[] args) {
		
		// 프로그램에서 랜덤값을 만드는 방법
		
		//double d = Math.random();				// 랜덤한 실수를 돌려줌(반환)
		//System.out.println(d); 	 			// 0 <= d < 1	( 0 이상 1 미만의 랜덤 실수값 )
		
		//double d = Math.random() * 10;		// 0 <= d < 10	( 0 이상 10 미만의 랜덤 실수값 )
		
		// int d = (int)(Math.random() * 10);	// 0 <= d < 10	( 0 이상 10 미만의 랜덤 정수값 )
		
		int d = (int)(Math.random() * 10) + 1;	// 1 부터 10 중 랜덤 정수 값 ( 1 이상 11 미만의 랜덤 정수값 )
												// ()를 Matn.random 에 씌워 우선순위를 둔다. 계산 순서 참고.
		System.out.println(d);
		
		// 3항 연산식
		// 조건 ? 연산1 : 연산2
		
		//d % 2 == 0 ? "짝수" : "홀수";
		//String result = d % 2 == 0 ? "짝수" : "홀수";
		//System.out.println(result);
		
		System.out.println( d % 2 == 0 ? "짝수" : "홀수" );	// 변수에 3항 연산식을 저장하지 않고 바로 사용 가능		
		
	}
}
