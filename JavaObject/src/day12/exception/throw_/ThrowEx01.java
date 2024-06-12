package day12.exception.throw_;

public class ThrowEx01 {
	
	public static void main(String[] args) {
		// 대신 예외처리를 진행
		try {
			
			System.out.println( sum(10) );
			System.out.println( sum(-5) );
			
		} catch (Exception e) {
			System.out.println("양수로 전달해야 합니다.");
			// e 변수에 접근하면 Exception 클래스의 여러 기능을 사용할 수 있다.
			System.out.println(e.getMessage());	// 예외 메세지를 얻는 getter 메서드
			e.printStackTrace();// printStackTrace() : 예외 발생시에 예외 경로를 추적하는 메시지를 출력한다.
								// 						(예외 원인을 찾을 때 항상 사용한다.)
		}
		
		System.out.println("프로그램 정상 종료");
	}
	
	// 1부터 양수 n 까지의 합
	public static int sum(int n) throws Exception {
		
		// 음수가 들어오면, 예외를 발생시키고 메서드를 강제종료
		if(n < 0) {
			// 예외를 생성하게 되면, 예외를 처리할 
			// try 구문이나 throws 구문을 사용해서 예외처리를 진행해야 한다.
			throw new Exception("예외 메세지를 여기에 전달");	// 예외 생성문
		}		
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

}
