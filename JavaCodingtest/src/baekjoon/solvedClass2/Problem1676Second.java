package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1676Second {
	
	public static void main(String[] args) throws IOException {
		
		// 팩토리얼 0의 개수
		/*
		1. 0 이 추가되는 조건
			2와 5가 곱해질 때마다 0이 추가된다.
			a * 2 * 5 = a * 10 (맨 뒷자리에 0 추가)
			
			ex) !5 = 5 * 4 * 3 * 2 * 1
		           = 5 * (2*2) * 3 * 2 * 1
				   = 10 * 2 * 3 * 2 * 1 -> 0은 1개
		
	    2. 2와 5가 같이 곱해진 횟수는
	       2가 곱해진 횟수와 5가 곱해진 횟수 중 더 작은 값
		 
		3. 1부터 N 까지의 수 중 2의 배수가 5의 배수보다 많으므로 
			더 작은 값은 항상 5가 곱해진 횟수 이다.
		
		4. 따라서 맨 뒷자리에 0이 얼마나 추가 되었는지를 구하려면
		   N! 에서 5가 몇 번 곱해졌는지 구하면 된다.
		
		ex) 25! 에서 5가 곱해진 횟수는
		    25 = 5 * 5		-> 2
		    20 = 2 * 2 * 5	-> 1
		    15 = 3 * 5,		-> 1
		    10 = 2 * 5,		-> 1
		    5  = 1 * 5		-> 1
		    총 6번이다.
		    
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = countZero(n);
				
		System.out.println(cnt);
		br.close();
	}
	
	public static int countZero(int n) {
		int cntFive = 0;
		while(n > 0) {
			if(n % 5 == 0) {
				cntFive += divide(5, n, 0);
			}
			n--;
		}
		return cntFive;
	} 
	
	public static int divide(int a, int b, int cnt) {
		if(b % a == 0) {
			cnt++;
			return divide(a, b / a, cnt);
		} else {
			return cnt;
		}
	}
	
}