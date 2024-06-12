package quizObject23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz03 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. Buffered 사용해서 건담.txt 를 읽어 들입니다.
		 * 2. 정규표현식을 사용해서 일련번호 , 지점(건담베이스 강남점), 
		 * 		등급[등급], 상세내용, 가격 으로 나누어서 출력해주세요.
		 * 
		 * 힌트
		 * 상세내용은 정규표현식으로 찾기가 불가능하므로
		 * 시작지점, 끝지점을 사용해서 문자열 자르기
		 * 
		 * 20180311-01-0079201803112 건담베이스 부천점 [RG] HACO ROOM 꼬마곰 재키 키트 1 15,500원
		 */
		BufferedReader br = null;
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\건담.txt";
		String pattern = "(\\d{8}-\\d{2}-\\d+)\\s(건담\\s[가-힣]+|건담베이스\\s[가-힣]+)\\s(\\[[A-Z가-힣]+\\])";
		String pricePattern = "[\\d+,?]+원";
		
		try {
			br = new BufferedReader(new FileReader(path));
			String str;
			while((str = br.readLine()) != null) {
				Matcher m = Pattern.compile(pattern).matcher(str);
				Matcher m2 = Pattern.compile(pricePattern).matcher(str);
				int start = 0;
				while(m.find()) {
					System.out.println("일련번호 : " + m.group(1));
					System.out.println("지점 : " + m.group(2));
					System.out.println("등급 : " + m.group(3));
					start = m.end(3);
				}
				while(m2.find()) {
					String temp = str.substring(start, m2.start()).trim();
					String detail = "";
					int i = 0;
					if('0' <= temp.charAt(temp.length() - 1) && temp.charAt(temp.length() - 1) <= '9' ) {
						detail = temp.substring(0, temp.length() - 1);
						i = Integer.parseInt("" + temp.charAt(temp.length() - 1));
					} else {
						detail = temp;						
					}
					System.out.println("상세내역 : " + detail);
					System.out.println("개수 : " + i + "개");
					System.out.println("가격 : " + m2.group());
				}
				System.out.println("---------------------------------------");
			}
			System.out.println("프로그램 종료");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}
