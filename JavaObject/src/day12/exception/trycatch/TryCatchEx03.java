package day12.exception.trycatch;

public class TryCatchEx03 {
	
	public static void main(String[] args) {
		
		/*
		 * main 메서드에 실행시 매개값을 주는 방법.
		 * 
		 * Run탭 -> run configuration(실행설정) -> arguments탭
		 */
		
		try {			
			// 두 수의 합을 구하는 코드
			// main 메서드의 매개값
			String strA = args[0];
			String strB = args[1];
			// 문자열을 정수로 바꾸는 코드
			int a = Integer.parseInt(strA);
			int b = Integer.parseInt(strB);
			
			System.out.println("두 수의 합 : " + (a + b));			
			
			// 예외
			String str = null;
			str.charAt(0);
			
		// 여러가지 예외 동시 처리 가능 : 예외 1 | 예외 2 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행시 매개값을 2개 입력하세요.");
		} catch (NumberFormatException e) {
			System.out.println("실행시 매개값을 숫자로 입력하세요.");
		} catch (Exception e) {		// 마지막에 기타 예외 처리
			System.out.println("기타 예외 입니다.");
		}

		
		
	}

}
