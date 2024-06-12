package day12.exception.throws_;

public class ThrowsEx02 {
	
	public ThrowsEx02() throws Exception {
		System.out.println("생성자 호출");
		aaa();
		System.out.println("생성자 종료");
	}
	
	public void aaa() throws Exception {
		System.out.println("aaa 호출");
		bbb();
		System.out.println("aaa 종료");
	}
	public void bbb() throws Exception {
		System.out.println("bbb 호출");
		
//		try {
//			System.out.println(10 / 0);
//			
//		} catch (Exception e) {
//			System.out.println("예외처리 완료!");
//		}
		
		// 예외 발생
		System.out.println(10 / 0);
		
		System.out.println("bbb 종료");
	}

}
