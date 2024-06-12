package quizObject23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {
	
	public static void main(String[] args) {
		
		// 가격의 패턴을 찾아보세요
		String str = "헐2,500원 ㅋㅋㅋ 찾아보시지 1,200원 6000원 1,000,000원 사과가 10,000 이건 100000원";
		
		String pattern = "[\\d+,?]+";	// 1,2,3,4,5 인 경우도 포함된다.
		
		Matcher m = Pattern.compile(pattern).matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
