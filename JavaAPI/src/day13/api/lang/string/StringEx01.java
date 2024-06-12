package day13.api.lang.string;

import java.util.Arrays;

public class StringEx01 {
	
	public static void main(String[] args) {
		
		// String 클래스
		// 대표적인 final 클래스
		/*
		 * public final class String implements java.io.Serializable, Comparable<String>, CharSequence,
               Constable, ConstantDesc {
		 */
		
		String str1 = "홍길동";
		String str2 = new String("홍길동");
		String str3 = new String(new char[] {'홍', '길', '동'});
		// 문자열 -> 문자 들의 배열. 인덱스 번호를 가진다.
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("------------------------------");
		
		String str = "홍길동 입니다~ 안녕하세요!";
		
		// charAt()
		System.out.println("charAt()");
		System.out.println(str.charAt(0));
		
		System.out.println();
		
		//substring()
		System.out.println("substring()");
		System.out.println(str.substring(5));	// 5 미만 절삭
		System.out.println(str.substring(5, str.length()));	// 5 ~ 길이 미만 문자열 추출
		System.out.println(str.substring(4, 7)); // 인덱스 4, 5, 6 의 문자들로 만든 문자열
		
		System.out.println();
		
		// split()
		System.out.println("split()");
		String[] arr = str.split(" ");	// 구분자 (괄호 안의 값) 기준으로 문자열을 자름
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		// toCharArray()
		System.out.println("toCharArray()");
		char[] arr2 = str.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		System.out.println();
		// indexOf(), lastIndexOf()
		str = "아아 안녕하세요 아아 반갑습니다아아";
		
		System.out.println("indexOf()");
		System.out.println(str.indexOf("아"));
		System.out.println("lastIndexOf()");
		System.out.println(str.lastIndexOf("아"));
		
		// 존재하지 않으면 음수
		System.out.println(str.indexOf("으"));
		
		if(str.indexOf("아") != -1) {
			System.out.println("아 문자는 존재 합니다.");
		}
		
		
		System.out.println();
		// length()
		// 길이 반환
		System.out.println("length()");
		System.out.println(str.length());
		
		System.out.println();
		// toUpperCase(), toLowerCase()
		// 대소문자 변경 (영어만 적용)
		str = "Hello World Happy Day";
		System.out.println("toUpperCase()");
		System.out.println(str.toUpperCase());
		System.out.println("toLowerCase()");
		System.out.println(str.toLowerCase());
		
		System.out.println();
		// trim()
		// 양끝 공백 제거. 사이 공백은 지워지지 않음
		str = "   abacaaa 123   ";
		System.out.println("trim()");
		System.out.println(str.trim());
		
		System.out.println();
		// replace()
		// 문자 변경 -> 변경할 문자에 "" 를 넣어 삭제 가능
		// 새로운 문자열을 반환하기 때문에 원본 문자열에는 영향을 미치지 않는다.
		System.out.println("replace()");
		System.out.println(str.replace("a", "에이"));
		
		// 원본 문자 변형
		str = str.replace(" ", "");
		System.out.println(str);
		
		System.out.println();
		// equals()
		// 문자열 비교
		System.out.println("equals()");
		System.out.println("홍길동".equals("홍길동"));
		
		System.out.println();
		// compareTo() 
		// 문자열 대소 비교
		// 문자열 인덱스 순서대로 비교 후 탈출
		// 양수 : 뒤의 문자가 앞에 있다. 음수 : 앞의 문자가 앞에 있다.
		System.out.println("compareTo()");
		System.out.println("홍길동".compareTo("이순신"));
		System.out.println("홍길동".compareTo("홍길자"));
		System.out.println("홍길동".compareTo("홍길동"));
		
		System.out.println();
		// String.join()
		// 문자열 합치기
		System.out.println("String.join()");
		System.out.println(String.join("->", "서울", "대구", "대전", "부산"));
		
		System.out.println();
		// String.valueOf
		// 기본타입을 문자열로 형변환
		System.out.println("String.valueOf()");
		System.out.println(String.valueOf(3) + String.valueOf(3));
	}

}
