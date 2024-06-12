package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1676 {
	
	public static void main(String[] args) throws IOException {
		
		// 팩토리얼 0의 개수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = countZero(n);
				
		System.out.println(cnt);
		br.close();
	}
	
	// n 부터 1 까지 5와 2가 곱해진 개수 구하기 반복문
	public static int countZero(int n) {
		int cntTwo = 0;
		int cntFive = 0;
		while(n > 0) {
			if(n % 2 == 0) {
				cntTwo += divide(2, n, 0);
			}
			if(n % 5 == 0) {
				cntFive += divide(5, n, 0);
			}
			n--;
		}
		return cntTwo >= cntFive ? cntFive : cntTwo;
	} 

	public static int divide(int a, int b, int cnt) {
		if(b % a == 0) {
			cnt++;
			return divide(a, b / a, cnt);
		} else {
			return cnt;
		}
	}
	/*
	 int a 로 나누어 떨어질 때 마다 cnt++
	 몫을 다시 넣어 나누어 떨어지는지 확인.
	 
	 ex) divide(5, 600, 0) 실행   1번 메서드
	     if(600 % 5 == 0 -> true) {
	     	cnt = 0 + 1
	     	
	     	return divide(5, 600 / 5, 0 + 1) 실행	2번 메서드
	      = return 2     	
	     			600 / 5 = 120
	     			if(120 % 5 == 0 -> true) {
	     			cnt = (0+1) + 1
	     		
	 				return divide(5, 120 / 5, (0+1) + 1) 실행  3번 메서드
	 			  = return 2
	 						120 / 5 = 24
	 						if(24 % 5 == 0 -> false) {
	 			
	 						} else {
	 							return (0+1) + 1 = 2
	 							(3번 메서드 종료 -> 2 반환)  
	 						}
	 				}
	 	}
	 	
	*/
	
}