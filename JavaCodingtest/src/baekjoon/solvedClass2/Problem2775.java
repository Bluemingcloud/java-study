package baekjoon.solvedClass2;

import java.util.Scanner;

public class Problem2775 {
	
	public static void main(String[] args) {
		
		/*
		 * 1	k+2		(1 + k+1) 					// k 번째 층
		 * 1	k+1		(1 + 									// k - 1 번째 층
		 * 1
		 * 1	1 + (1 + (1+2)) 
		 * 1	1 + (1+2)	1 + (1+2) + (1+2+3)		10			16			31													// 2 층
		 * 1	1 + 2		1 + 2 + 3				10			15			21			28			36				// 1 층
		 * 1	2			3			4			5			6			7			8 				// 0 층
		 * 
		 * 1호	2호			3호			4호			5호		n호
		 */
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int[] arr = new int[14];
		for(int i = 1; i <= arr.length; i++) {
			arr[i - 1] = i;
		}		
			
		for(int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			if(k == 0) {
				System.out.println(arr[n - 1]);
				continue;
			}
			int[] result = dynamicMethod(n,arr);
			for(int j = 0; j < k - 1; j++) {
				result = dynamicMethod(n, result);
			}
			System.out.println(result[n - 1]);
		}
		sc.close();
		
	}
	public static int[] dynamicMethod(int n, int[] arr) {
		int[] result = new int[n];
		result[0] = 1;
		for(int i = 1; i < result.length; i++) {
			for(int j = 0; j <= i; j++) {
				result[i] += arr[j];
			}			 
		}
		return result;
	}
}
