package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11050 {
	
	public static void main(String[] args) throws IOException {
		
		// 이항 계수
		// (N K) -> nCk = n!/k!(n - k)!
		// k = 0 -> 0, k >= n -> 0
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.println(binominal(n, k));	
		
	}
	public static int binominal(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n - k));
	}
	public static int factorial(int a) {
		int result = 1;
		while(a > 0) {
			result *= a;
			a--;
		}
		return result;
	}

}
