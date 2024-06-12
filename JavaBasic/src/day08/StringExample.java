package day08;

import java.util.Arrays;

public class StringExample {
	
	public static void main(String[] args) {
		
		// 문자열을 다루는 다양한 방법
		
		// 문자열은 사실 char 문자들의 배열이 합쳐진 것
		// 문자열도 index를 가진다.
		
		// 문자열.메서드명();
		String str = "안녕하세요~";
		
		
		// 문자열 인덱스번호 자르기
		char c = str.charAt(0);	// charAt(int index) : char - String
								// 메서드(매개변수) : 반환타입 - 클래스
		System.out.println("0번째 인덱스 : " + c);
		
		// 문자열의 길이		.length()
		System.out.println("문자열 길이 : " + str.length());
		char cEnd = str.charAt(str.length() - 1);
		System.out.println("마지막번째 인덱스 : " + cEnd);
		
		// 문자 찾기			.indexOf(문자열)
		System.out.println("녕 이 있는 위치 : " + str.indexOf("녕"));
		System.out.println(str.indexOf("흠"));	// 없는 문자라면 -1 반환
		
		// 문자 변경하기		.replace(문자열, 문자열)
		String r1 = str.replace("안녕", "hello");	// 대상문자, 변경할 문자
		System.out.println(str);					// 새로 반환해 주는 것이라 원본 문자열은 그대로
		System.out.println(r1);
		
		String str2 = "아 집에 가고 싶다아아~ ㅠㅠ";
		str2 = str2.replace(" ", "");				// 공백이 전부 바뀜.
		System.out.println(str2);
		
		str2 = str2.replaceFirst("아", "지금");		// 첫번째 "아" 만 "지금" 으로 바뀐다.
		System.out.println(str2);
		
		// 문자열 자르기		.substring(index)
		System.out.println(str.substring(2));
		System.out.println(str.substring(0,2));	// 0부터 2미만
		
		// 문자열 자르기		.split(문자열)
		String str3 = "010-1234-5678";
		String[] arrStr = str3.split("-");		// - 기준으로 잘라서 배열로 변환
		System.out.println(Arrays.toString(arrStr));
		
		String[] arrStr2 = str3.split("");		// 한글자로 잘라줌
		System.out.println(Arrays.toString(arrStr2));
		
		char[] arrStr3 = str3.toCharArray();	// char 유형으로 잘라서 배열로 변환
		System.out.println(Arrays.toString(arrStr3));
		
		// 양측 공백 제거		.trim()
		String str4 = "    hello world     ";
		System.out.println(str4.trim());
		
		// 문자열의 비교		.equals(문자열)
		System.out.println("홍길동".equals("홍길동"));	// true
		System.out.println("홍길동".equals("이순신"));	// false
		
		// 문자열의 대소비교	.compareTo(문자열)
		// (앞문자 아스키코드의 합 - 뒤문자 아스키코드의 합)
		System.out.println("ABC".compareTo("ABC"));		// 0 	: 같은문자
		System.out.println("ABC".compareTo("ABD"));		// -1 	: 뒤에문자가 사전적으로 뒤에있음
		System.out.println("ABC".compareTo("ABB"));		// 1	: 뒤에문자가 사전적으로 앞에있음
		System.out.println("ABC".compareTo("ACB"));		// -1	: 각자리별로 비교 후 끝냄 (AB AC 비교)
		
		// 문자열 합치기 String.join(사이에 넣을 문자열, 문자열1 ... )
		System.out.println(String.join("->", "홍", "길", "동"));
	}

}
