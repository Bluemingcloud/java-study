package quiz01;

public class Quiz02 {

	public static void main(String[] args) {
		
		/*
		 * 0 ~ 10 범위의 랜덤한 정수를 생성하고, 5에서 빼주면 범위는 -5 ~ 5 가 됩니다.
		 * 
		 * 이 값을 가지고, 3항 연산식을 이용해서 절대값을 출력해주세요.
		 */
		
		int num = (int)(Math.random() * 11) - 5; // 0 부터 1까지 -> 0 부터 11까지 즉 0 이상 10이하. 11을 곱해야 함!
		System.out.println( "숫자 " + num + " 의 절대값 : " + (num >= 0 ? num : -num));
	}
}
