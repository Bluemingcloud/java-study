package day14.api.util.strtoken;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		
		// StringTokenizer 클래스 
		// 문자를 특정 구분자를 기준으로 잘라서 사용할 때 유용.
		// split() 과 유사한 기능
		// 배열 생성이 아니다!
		// 나누어진 문자열을 1열로 나열후
		// 커서를 전진하며 값을 사용 (nextToken(), nextElements())
		// 다음 값이 없으면 에러가 난다.
		// 
		// 안전한 사용법
		// 커서를 전진할 때 
		// 다음 값이 있으면 true 없으면 false 
		// true 면 전진 후 값 반환
		// false 면 종료
		//
		// 한번 커서가 전진 하면 뒤의 값은 소멸된다.
		
		String str1 = "오늘은 5월 31일 이고, 금요일 입니다.";
		
		// StringTokenizer 객체 생성
		// 아무런 기준이 없으면 공백을 기준으로 자른다.
		StringTokenizer st = new StringTokenizer(str1);
		
		// countTokens()
		// 잘린 문자의 기준
		System.out.println(st.countTokens());
		
		// nextToken()
		// 잘린 문자 사용 (커서의 전진)
		/*
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		// 모두 사용 후
		System.out.println(st.nextToken());
		// 에러가 난다.
		 */
		
		// hasMoreTokens()
		// 다음 값이 있는지 확인
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("--------------------------------------------");
		
		String log = "2024.05.31, 금요일, 홍길동, /no=30, id=aaa123";
		
		// 구분자를 기준으로 자르기
		StringTokenizer st2 = new StringTokenizer(log, ",");
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println("--------------------------------------------");
		
		// 구분자를 여러개 사용 가능
		StringTokenizer st3 = new StringTokenizer(log, ",./="); // , . / = 구분자들 기준으로 자른다.
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken().replace(" ", ""));
		}
		
		System.out.println("--------------------------------------------");
		
		// 3번째 인자에 true, false 입력시
		// true -> 구분자도 잘린 문자에 포함
		// false -> 구분자 미포함
		StringTokenizer st4 = new StringTokenizer(log, ",", true);
		
		while(st4.hasMoreTokens()) {
			System.out.println(st4.nextToken());
		}
	}
}
