package baekjoon.problem03;

import java.util.Scanner;

public class Problem2439 {
	public static void main(String[] args) {
		// 별 찍기 - 2 (우측정렬)
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		String starArr[] = new String[N];
		for(int i = 0; i < N; i++) {
			starArr[i] = " ";
		}     
			  
		for(int i = 0; i < N; i++) {
			String txt = "";
			starArr[N-i-1] = "*";
			for(int j = 0; j < N; j++) {
				txt += starArr[j];
			}
			
			System.out.println(txt);
		}
		scan.close();
	}
}
