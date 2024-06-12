package baekjoon.problem07;

import java.util.Scanner;

public class Problem2738Second {
	
	public static void main(String[] args) {
		
		// 행렬 덧셈
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arrA = setArr(n, m, scan);
		int[][] arrB = setArr(n, m, scan);			
		scan.close();		
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arrA[i][j] + arrB[i][j] + " ");
            }
            System.out.println();
        }	
	}

	public static int[][] setArr(int n, int m, Scanner scan) {
		int[][] arr = new int[n][m];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		return arr;
	}
}
