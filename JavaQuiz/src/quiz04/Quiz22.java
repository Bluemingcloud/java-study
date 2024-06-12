package quiz04;

import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		
		/*
		 * 느린소수의 합
		 
		어떤 수 x가 주어질 때 x까지의 수 중 소수들의 합을 출력해주세요.

		소수?
		소수는 약수가 1과 자기자신인 수 입니다.

		예시
		5 까지의 소수합은 2 + 3 + 5 = 10 입니다
		6 까지의 소수합은 2 + 3 + 5 = 10 입니다
		7 까지의 소수합은 2 + 3 + 5 + 7 = 17 입니다
		*/
//		int cnt = 0;
//		for(int i = 1; i < num; i++) {
//			if(num % i == 0) {
//				cnt++;
//			}
//		}
//		if(cnt == 1) {
//			System.out.println(num + "은(는) 소수 입니다.");
//		} else {
//			System.out.println(num + "은(는) 소수가 아닙니다.");
//		}
		
		// 느린 이라 쓴 이유
		// 중첩 반복문 -> 시도 횟수가 N의 제곱 번
		// N의 크기가 증가할 수록 소요시간이 급격하게 증가한다.
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		int sum = 0;
		
		for(int i = 1; i <= x; i++) {		// 1 부터 x 까지의 자연수 i
			int cnt = 0;
			for(int j = 1; j <= i; j++) {	// 1 부터 i 까지의 수를 나눠 나머지가 0 이면 카운트( i 의 약수 개수 구하기 )
				if(i % j == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {					// 약수가 2개인 소수 i 를 더한다.
				sum += i;
			}
			
		}
		System.out.println(sum);	
		
	}

}
