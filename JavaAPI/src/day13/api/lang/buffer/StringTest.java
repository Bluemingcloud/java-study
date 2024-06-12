package day13.api.lang.buffer;

public class StringTest {
	
	public static void main(String[] args) {
		
		// 문자열과 빠른 문자열의 속도비교
		
		// 일반 문자열 더하기
		long start = System.currentTimeMillis();
		String s = "";
		
		int i = 200000;
		while(i-- > 0) {
			s += "A";
		}				
		
		long end = System.currentTimeMillis();
		
		System.out.println("String 소요시간 : " + (end - start) * 0.001 );
		
		System.out.println("-------------------------------------------");
		
		// 빠른 문자열 더하기
		long start2 = System.currentTimeMillis();
		
		StringBuffer s2 = new StringBuffer("");
		
		int j = 200000;
		while(j-- > 0) {
			s2.append("A");
		}				
		
		long end2 = System.currentTimeMillis();
		
		System.out.println("StringBuffer 소요시간 : " + (end2 - start2) * 0.001 );
			
	}

}
