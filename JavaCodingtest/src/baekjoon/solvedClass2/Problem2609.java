package baekjoon.solvedClass2;

import java.util.Scanner;

public class Problem2609 {
	
	public static void main(String[] args) {
		
		// 최대 공약수와 최소 공배수
		
		// 유클리드 호제법
		// a = b * q + r 일때
		// a 와 b 의 최대 공약수는 b 와 r 의 최대 공약수와 같다.
		// q의 값은 상관 x
		// r = a % b
		
		// r2 = b % r
		// b = r * q2 + r2
		// b 와 r 의 최대 공약수는 r 과 r2의 최대 공약수와 같다.
		
		// rn = rn-2 % rn-1 이 0 이면
		// rn-2 = rn-1 * qn + rn
		// rn-2 = rn-1 * qn 
		// 최대 공약수는 rn-1 이된다.
		
		// 즉 r 이 0 이 될때 까지 반복
		
		// a 와 b 의 크기는 비교해야 하는가?
		// 만약 a < b 라면
		// r1 = a % b 에서 a 가 반환
		// 다음 반복에서
		// b 와 r1 의 최대 공약수와 같음 을 이용
		// b = r1 * q + r2
		// r2 = b % r1
		// r2 = b % a
		// 즉 반복 횟수 1회 증가 외에는 같은 결과가가 나온다.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int comMin = 0;		
		for(int i = Math.max(a, b); i <= a * b; i++) {
			if(i % a == 0 && i % b == 0) {
				comMin = i;
				break;
			}
		}
		int comMax = euclidean(a,b);
		System.out.println(comMax);
		System.out.println(comMin);		
	}
	
	public static int euclidean(int a, int b) {
		if(b == 0) {
			return a;
		}
		return euclidean(b, a % b);
	}
}
