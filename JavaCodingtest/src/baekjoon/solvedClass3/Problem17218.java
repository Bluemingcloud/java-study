package baekjoon.solvedClass3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem17218 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pw1 = br.readLine();
		String pw2 = br.readLine();
		int n = pw1.length();
		int m = pw2.length();
		br.close();
		
		// 같은 문자를 중첩해서 쌓은 문자열 길이 저장 배열
		int[][] dp = new int[n + 1][m + 1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(pw1.charAt(i - 1) == pw2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		
		for(int i = 0; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		
	}
	

}
