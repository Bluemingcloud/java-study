package baekjoon.problem03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem15552 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			// BufferedReader 는 String 타입을 받는다.
			String str = br.readLine();
			
			// Integer.parseInt() 를 이용해 int값으로 변환.
			// parseInt 사용시 해당 문자열 중 정수 값 인것만 출력한다.
			int T = Integer.parseInt(str);
			
			// BufferedReader 는 공백구분이 아닌 행으로 구분하여 저장한다.
			// 정규 표현식으로 정수를 구분한다.
			
			for(int i = 0; i < T; i++) {
				String strNum = br.readLine();
				int sum = 0;
				Pattern pattern = Pattern.compile("\\d+");
				Matcher matcher = pattern.matcher(strNum);
				while (matcher.find()) {
					sum += Integer.parseInt(matcher.group());
				}	
				bw.write(sum + "\n");
			}
			
			// StringTokenizer를 통해 구분한다.
			for(int i = 0; i < T; i++) {
				String strNum = br.readLine();
				StringTokenizer st = new StringTokenizer(strNum);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write(a+b+"\n");
			}
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
