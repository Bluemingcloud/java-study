package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1676Third {
	
	public static void main(String[] args) throws IOException {
		
		// 팩토리얼 0의 개수
		//
		// 1부터 N 까지 중
		// 2가 곱해진 횟수와 5가 곱해진 횟수 중에 더 적은 수
		// 2의 배수가 더 많으므로 5가 곱해진 횟수만 찾으면 된다.
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		while(n >= 5) {
			
			cnt += n / 5;
			n /= 5;
			
		}		
				
		System.out.println(cnt);
		br.close();
	}	
}