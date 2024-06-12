package quizObject23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	
	public static void main(String[] args) {
		
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(갓혜자도시락) 6,000";
		
		String[] arr = {str, str2, str3};
		
		// arr 상품번호, gs25, 상품명, 가격 을 정규표현식으로 나눠서 출력
		
		String pattern = "([0-9]+-[0-9]+)\\s(GS25|GS)(\\([가-힣]+\\))\\s([0-9]+,.[0-9]+)";

		for(String s : arr) {
			Matcher matcher = Pattern.compile(pattern).matcher(s);
			
			while(matcher.find()) {
				System.out.println("상품번호 : " + matcher.group(1));
				System.out.println("상호명 : " + matcher.group(2));
				System.out.println("상품명 : " + matcher.group(3));
				System.out.println("가격 : " + matcher.group(4));				
			
			}
			System.out.println("--------------------------------------------");
			
			
		}
		
	}

}
