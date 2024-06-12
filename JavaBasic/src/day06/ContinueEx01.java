package day06;

public class ContinueEx01 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 0) {
				continue;	// 반복문의 다음으로 이동
			}
						
			System.out.println(i);
			
		}
		
		System.out.println("-----------------------");
		
		int i = 0;
		while(i++ < 10) {	// while 안의 조건문이 (i<10) 인 경우 무한루프에 빠진다.
							// 해결법
							// 1. 조건문에서 i 를 증가 시킨다.
//			i++;			// 2. 증가를 먼저 써준다.
			if(i == 5) {
//				i++;		// 3. 반복문 안에 증가를 넣어준다.
				continue;							
			}
			
			System.out.println(i);
			
		}
		
		
	}
}
