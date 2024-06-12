package day13.api.lang.system;

import java.util.Properties;

public class SystemEx01 {
	
	public static void main(String[] args) {
		
		// System 클래스는 static 메서드 로 구성
		
		
		// /** Don't let anyone instantiate this class */
//		new System();
		
		// exit()
//		System.exit(0);	// 0 프로그램 종료
//		System.out.println("실행 테스트");
		
		// getProperties()
		// getter 메서드 
		// Properties 타입 반환
		// 운영체제 관련된 내용들을 얻을 수 있음.
//		Properties p = System.getProperties(); 
//		System.out.println(p);
//		System.exit(0);
		// currentTimeMillis()
		// long 타입
		// 컴퓨터의 현재시간을 밀리세컨드 단위와 나노세컨드 단위로 반환
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		long start = System.currentTimeMillis();
		
		// 프로그램 코드
		int n = 0;
		for(long i = 1; i <= 500000L; i++) {
			n++;
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간 : " + (end - start) * 0.001); // 프로그램 소요시간 초단위
	}

}
