package baekjoon.solvedClass2;

import java.util.Scanner;

public class Problem7568 {
	
	public static void main(String[] args) {
		
		// 덩치
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		int[] rank = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < n; i++) {
			int temp = 1;
			for(int j = 0; j < n; j++) {
				if(i != j) {
					if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
						temp++;
					}					
				}
			}
			rank[i] = temp;
		}
		
		for(int r : rank) {
			System.out.print(r + " ");
		}
		
	}

}
