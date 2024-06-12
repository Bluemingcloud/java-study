package baekjoon.problem03;

import java.util.Scanner;

public class Problem2438 {
	public static void main(String[] args) {
		// 별 그리기		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String starArr[] = new String[N];
		
		for(int i = 1; i < N+1; i++) {
			String star = "";
			for(int j = 0; j < i; j++) {
				star += "*";
			}		
			starArr[i-1] = star;
		}
		for(int i = 0; i < N; i++) {
			System.out.println(starArr[i]);
		}
		scan.close();
	}
}
