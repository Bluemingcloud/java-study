package quiz02;

public class Quiz05 {
	public static void main(String[] args) {
		/*
		 * Quiz02의 문제를 if~else 문장으로 변경
		 *
		 * 0 ~ 10 범위의 랜덤한 정수를 생성하고, 5에서 빼주면 범위는 -5 ~ 5 가 됩니다. 
		 * 이 값을 가지고, 3항 연산식을 이용해서 절대값을 출력해주세요.
		 */
		int num = (int)(Math.random() * 11) - 5;
		System.out.println( "랜덤값 : " + num );
		
		int result;	// 결과값을 저장할 변수 생성
		
		if(num >= 0) {
			result = num;
		} else {
			result = -num;
		}
		System.out.println( "절대값 : " + result );
	}
}
