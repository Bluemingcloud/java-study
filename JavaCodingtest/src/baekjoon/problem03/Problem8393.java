package baekjoon.problem03;

import java.util.Scanner;

public class Problem8393 {
	public static void main(String[] args) {
		
		// 1 부터 n 까지의 합 구하기.
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 1; i<n+1; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		scan.close();
	}
}
