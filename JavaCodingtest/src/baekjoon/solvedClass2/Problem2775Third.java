package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2775Third {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());		
			
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());

			System.out.println(dynamicMethod(k, n));
		}
		
	}
	public static int dynamicMethod(int k, int n) {
		int result = 0;
		if(k == 0) {
			return n;
		}
		// 제일 먼저 반환되는 값은 dynamicMethod(0, 1) 의 반환 값 1
		// result 에 1부터 i 까지 더한다.
		// 다음 반복에서 1부터 i까지의 합이 반환, 반환된 값을 result 에 더한다.
		// k - 1까지 반복한다.
		// 0층 : 1, 2, 3, 4 ,...
		// 1층 : 1, 1+2, 1+2+3, 1+2+3+4,...
		// 2층 : 1, 1 + (1+2), 1 + (1+2) + (1+2+3), 1 + (1+2) + (1+2+3) + (1+2+3+4),... 
		for(int i = 1; i <= n; i++) {
			result += dynamicMethod(k - 1, i);			 
		}
		return result;
	}
}