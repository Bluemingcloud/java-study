package baekjoon.problem08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11005 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		br.close();
		// n = a3 * b^3 + a2 * b^2 + a1 * b^1 + a0
		// a3 = n / b^3
		// a2 = (n % b^3) / b^2 = (n - a3 * b^3) / b^2
		//
		// n / b, n % b
		
		int p = 1;
		while(Math.pow(b, p) <= n) p++; 
		
		StringBuilder sb = new StringBuilder();
		while(p-- > 0) {
			
			int a = n / (int)Math.pow(b, p);			
			sb.append(a > 9 ? "" + (char)(a - 10 + 'A') : a);
			
			n %= (int)Math.pow(b, p);
		}

		System.out.println(sb);
		
		
	}
	
}
