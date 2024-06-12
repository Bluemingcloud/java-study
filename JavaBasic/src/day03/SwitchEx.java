package day03;

public class SwitchEx {
	public static void main(String[] args) {
		
		//switch 예제
		
		int a = 0;
		
		//switch 에 들어가는 값은 정수 or 문자 or 문자열 이다.
		switch(a) {
		
		case 0:		// break 없이 붙여서도 쓴다.
		case 1:
			System.out.println("0 또는 1 입니다.");
			break;	// switch문을 탈출한다.
		case 2:
			System.out.println("2 입니다.");
			break;
		case 3:
			System.out.println("3 입니다.");
			break;
		case 4:
			System.out.println("4 입니다.");
			break;
			
		default :
			System.out.println("1, 2, 3, 4 가 아닙니다.");
		}
		
		
		
		
		
	}
}
