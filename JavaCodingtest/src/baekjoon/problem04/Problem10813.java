package baekjoon.problem04;

import java.util.Scanner;

public class Problem10813 {
	public static void main(String[] args) {
		
		// 공 넣기
		/*
		 *  5 4		1 2 3 4 5	
			1 2		2 1 3 4 5		
			3 4		2 1 4 3 5
			1 4		3 1 4 2 5
			2 2		3 1 4 2 5
		 */
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		for(int b = 0; b < arr.length; b++) {
			arr[b] = b + 1;
		}
		
		int i = 0;
		while(i < M) {
			int j = scan.nextInt();
			int k = scan.nextInt();
			int temp = arr[j-1];
			
			arr[j-1] = arr[k-1];
			arr[k-1] = temp;
			
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
