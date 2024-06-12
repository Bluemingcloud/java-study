package day12.exception.trycatch;

public class TryCatchEx01 {
	
	public static void main(String[] args) {
		

//		int x = 1;
//		int y = 0;
//		
//		System.out.println(x + y);
//		System.out.println(x - y);
//		System.out.println(x / y);	// 에러 발생 0 으로 나눌수 없음
//		System.out.println(x * y);
//	
//				
//		try {
//			int x = 1;
//			int y = 0;
//			
//			System.out.println(x + y);
//			System.out.println(x - y);
//			System.out.println(x / y);	// 에러 발생 0 으로 나눌수 없음
//			System.out.println(x * y);
//			
//		} catch (ArithmeticException e) {	// 예외의 종류가 들어간다.
//			System.out.println("0으로 나눌 수 없습니다.");			
//		}
		
		int x = 1;
		int y = 0;
		
		System.out.println(x + y);
		System.out.println(x - y);
		try {
			System.out.println(x / y);	// 에러 발생 0 으로 나눌수 없음
			
		} catch (ArithmeticException e) {	// 예외의 종류가 들어간다.
			System.out.println("0으로 나눌 수 없습니다.");			
		}
		System.out.println(x * y);
		
		
		System.out.println("프로그램 정상 종료");
	}

}
