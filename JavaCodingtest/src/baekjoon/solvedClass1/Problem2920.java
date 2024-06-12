package baekjoon.solvedClass1;

import java.util.Scanner;

public class Problem2920 {
	
	public static void main(String[] args) {
		
		// 음계
		/*
		 * 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 
		 * 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. 
		 * c는 1로, d는 2로, ..., C를 8로 바꾼다.
		 * 1부터 8까지 차례대로 연주한다면 ascending, 
		 * 8부터 1까지 차례대로 연주한다면 descending, 
		 * 둘 다 아니라면 mixed 이다.
		 * 연주한 순서가 주어졌을 때, 
		 * 이것이 ascending인지, descending인지, 아니면 mixed인지 
		 * 판별하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == i + 1) {
				cnt++;
			} else if (arr[i] == arr.length - i) {
				cnt--;
			}			
		}
		
		if(cnt == 8) {
			System.out.println("ascending");
		} else if(cnt == -8) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}		
	}
}