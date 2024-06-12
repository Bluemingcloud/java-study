package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11050Second {
	
	public static void main(String[] args) throws IOException {
		
		// 이항 계수
		// (N K) -> nCk = n!/k!(n - k)!
		// k = 0 -> 0, k >= n -> 0
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));
		
	}
	public static int factorial(int a) {
		if(a == 0) {
			return 1;
		}
		return a * factorial(a - 1);
	}
}
