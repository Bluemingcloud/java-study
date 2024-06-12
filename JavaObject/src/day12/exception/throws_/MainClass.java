package day12.exception.throws_;

public class MainClass {
	
	public static void main(String[] args) {
		
		try {
			new ThrowsEx02();		
			
		} catch (Exception e) {
			System.out.println("main 에서 예외처리");
		}
		
		System.out.println("프로그램 정상 종료");
	}

}
