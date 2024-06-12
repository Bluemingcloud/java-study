package baekjoon.problem04;

import java.util.Scanner;

public class Problem10813Fourth {
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
		
		for(int i = 0; i < M; i++) {
			int a = scan.nextInt() - 1;	// a번 바구니 : 인덱스 a - 1 번째 배열의 상자
			int b = scan.nextInt() - 1;
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;			
		}
		scan.close();
		
		for(int a : arr) {
			System.out.print(a + " ");
		}		
	}
}
