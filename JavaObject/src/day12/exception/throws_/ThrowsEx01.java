package day12.exception.throws_;

public class ThrowsEx01 {
	
	public static void main(String[] args) {
		/*
		 * 메서드, 생성자에서 발생되는 예외 떠넘기기 키워드 throws
		 * 
		 * throws 가 붙어있는 메서드 또는 생성자를 호출할 때는 예외가 발생할 수 있다는 의미이기 때문에
		 * 호출한 블록에서 예외처리를 대신 진행해야 한다.
		 * 
		 * throws는 예외처리를 강요할 때 사용한다.
		 */
		try {
			greeting(10);	
			
		} catch (Exception e) {
			System.out.println("없는 인덱스 값 입니다.");
		}
		
		// throws로 만들어져 있는 대표적인 메서드
		try {
			Class.forName("홍길동");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		}
		
	}
	
	private static String[] arr = {"홍길동", "이순신", "홍길자"};
	
	public static void greeting(int index) throws ArrayIndexOutOfBoundsException {
		System.out.println(arr[index] + "님 안녕하세요.");
		System.out.println("메서드 종료");
	}
	

}
