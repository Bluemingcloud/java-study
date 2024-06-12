package quizObject23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02Second {
	
	public static void main(String[] args) {
		
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(갓혜자도시락) 6,000";
		
		String[] arr = {str, str2, str3};
		
		// arr 상품번호, gs25, 상품명, 가격 을 정규표현식으로 나눠서 출력
		
		String[] patterns = {
				"[0-9]{6}\\-[0-9]+",	// 상품번호
				"GS25|GS",				// 상호명
				"\\(.[가-힣]+\\).",		// 상품명
				"[0-9]+,.[0-9]+"		// 가격
		};

		for(String s : arr) {
			Matcher[] matchers = new Matcher[patterns.length];
			
			for(int i = 0; i < matchers.length; i++) {
				matchers[i] = Pattern.compile(patterns[i]).matcher(s);
			}
			
			while(matchers[0].find()) System.out.println("상품번호 : " + matchers[0].group());
			while(matchers[1].find()) System.out.println("상호명 : " + matchers[1].group());
			while(matchers[2].find()) System.out.println("상품명 : " + matchers[2].group());
			while(matchers[3].find()) System.out.println("가격 : " + matchers[3].group());
		}
		
	}

}
