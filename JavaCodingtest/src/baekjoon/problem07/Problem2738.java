package baekjoon.problem07;

import java.util.Scanner;

public class Problem2738 {
	
	public static void main(String[] args) {
		
		// 행렬 덧셈
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arrA = new int[n][m];
		int[][] arrB = new int[n][m];
		
		for(int i = 0; i < arrA.length; i++) {
			for(int j = 0; j < arrA[i].length; j++) {
				arrA[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < arrB.length; i++) {
			for(int j = 0; j < arrB[i].length; j++) {
				arrB[i][j] = scan.nextInt();
			}
		}	
		
		int[][] result = sumArr(n, m, arrA, arrB);
		
		for(int[] r : result) {
			for(int num : r) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		scan.close();		
	}

	static int[][] sumArr(int n, int m, int[][] arrA, int[][] arrB) {
		int[][] sum = new int[n][m];
		for(int i = 0; i < arrA.length; i++) {
			for(int j = 0; j < arrA[i].length; j++) {
				sum[i][j] = arrA[i][j] + arrB[i][j];
			}
		}
		return sum;
	}
}
