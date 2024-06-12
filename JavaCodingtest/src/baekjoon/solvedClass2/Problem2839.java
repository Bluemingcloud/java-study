package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2839 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(solution(n, 0));
			
		
	}
	private static int solution(int n, int result) {
		if(n % 5 == 0) return result + n / 5;
		if(n == 0) return result + 1;
		n -= 3;
		result++;
		return n > 0 ? solution(n, result) : -1;
		
	}

}
