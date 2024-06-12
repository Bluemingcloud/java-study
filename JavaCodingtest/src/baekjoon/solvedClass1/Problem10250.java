package baekjoon.solvedClass1;

import java.util.Scanner;

public class Problem10250 {
	
	public static void main(String[] args) {
		
		// ACM 호텔
		
		/*
		 * ACM 호텔 매니저 지우는 손님이 도착하는 대로 빈 방을 배정하고 있다. 
		 * 고객 설문조사에 따르면 손님들은 
		 * 호텔 정문으로부터 걸어서 가장 짧은 거리에 있는 방을 선호한다고 한다. 
		 * 여러분은 지우를 도와 줄 프로그램을 작성하고자 한다. 
		 * 즉 설문조사 결과 대로 호텔 정문으로부터 걷는 거리가 가장 짧도록 
		 * 방을 배정하는 프로그램을 작성하고자 한다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// t개의 테스트 데이터
		int t = sc.nextInt();		
		
		// t개의 배열 안에 3개의 요소(h, w, n)가 있는 배열 생성
		int[][] arr = new int[t][3];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		// n번째 손님의 방 : YYXX 형태
		// YY -> n % h(높이)
		// XX -> n / h + 1
		// 나머지가 0 인 경우
		// YY = h, XX = n / h
		// YYXX = (n % h) * 100 + (n / h + 1) 
		for(int[] num : arr) {
			if(num[2] % num[0] == 0) {
				System.out.println((num[0] * 100) + (num[2] / num[0]));
			} else {
				System.out.println((num[2] % num[0]) * 100 + (num[2] / num[0] + 1));
			}						
		}		
	}
}
