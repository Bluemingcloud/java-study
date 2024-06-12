package baekjoon.problem04;

import java.util.Scanner;

public class Problem10810 {
	public static void main(String[] args) {
		
		// 공 넣기
		/*
		 *  5 4
			1 2 3  3 3 0 0 0
			3 4 4  3 3 4 4 0
			1 4 1  1 1 1 1 0
			2 2 2  1 2 1 1 0
		 */
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		
		int i = 0;
		while(i < M) {
			int j = scan.nextInt();
			int k = scan.nextInt();
			int l = scan.nextInt();
			int m = j-1;
			while (m < k) {
				arr[m] = l; 
				m++;
			}			
			i++;
		}
		
		String result = arr[0] + "";
		for (int n = 1; n < arr.length; n++) {
			result += " " + arr[n];
		}
		System.out.println(result);
		
		scan.close();		
	}
}
