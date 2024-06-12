package day17.regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx01 {
	
	public static void main(String[] args) {
		
		String info = "홍길동|20세|서울시 강남구|010-1234-5678";
		
		// 전화번호 형식을 찾아서 마스킹 처리
		// ***-****-****;
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{3,4}";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(info);
		System.out.println(m.group());
		String pattern2 = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		
		String result = info.replaceAll(pattern2, "***-****-****");
		System.out.println(result);
	}

}
